package ru.mit.spbau.softwaredesign.shell.pipeline

import ru.mit.spbau.softwaredesign.shell.parser.ShellBaseListener
import ru.mit.spbau.softwaredesign.shell.parser.ShellParser
import ru.mit.spbau.softwaredesign.shell.utils.ParseException
import ru.mit.spbau.softwaredesign.shell.utils.listenShellString

class PipelineBuilder() : ShellBaseListener() {
    val nodes = mutableListOf<ExecutableNode>()

    override fun enterAssignment(ctx: ShellParser.AssignmentContext?) {
        super.enterAssignment(ctx)
        ctx ?: throw ParseException()

        val node = AssignmentNode(
                ctx.lhs().variable().name().text,
                ctx.rhs().text)

        nodes.add(node)
    }

    override fun enterCommand(ctx: ShellParser.CommandContext?) {
        super.enterCommand(ctx)
        ctx ?: throw ParseException()

        val args = ctx.argument().map { it.text }.toTypedArray()
        val node = CommandNode(
                ctx.identifier().text,
                args)

        nodes.add(node)
    }

    override fun enterArgument(ctx: ShellParser.ArgumentContext?) {
        super.enterArgument(ctx)
    }

    fun getPipeline() = Pipeline(nodes)
}

fun buildPipeline(line: String): Pipeline {
    val builder = PipelineBuilder()
    listenShellString(line, builder)

    return builder.getPipeline()
}
