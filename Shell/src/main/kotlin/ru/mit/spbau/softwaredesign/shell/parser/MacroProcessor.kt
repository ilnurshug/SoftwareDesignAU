package ru.mit.spbau.softwaredesign.shell.parser

import ru.mit.spbau.softwaredesign.shell.utils.listenShellString

private data class Substitution(val name: String, val start: Int, val stop: Int)

private class MacroProcessor(val processor: (Substitution) -> Unit) : ShellBaseListener() {
    private var skip = false

    override fun enterLhs(ctx: ShellParser.LhsContext?) {
        super.enterLhs(ctx)
        skip = true
    }

    override fun exitLhs(ctx: ShellParser.LhsContext?) {
        super.exitLhs(ctx)
        skip = false
    }

    override fun enterVariable(ctx: ShellParser.VariableContext?) {
        super.enterVariable(ctx)
        ctx ?: return

        if (skip) {
            return
        }

        processor(Substitution(
                ctx.name().text,
                ctx.start.startIndex,
                ctx.stop.stopIndex
        ))
    }
}

fun expandMacroses(line: String, env: (String) -> String): String {
    val substitutions = mutableListOf<Substitution>()
    val processor = MacroProcessor({ substitutions.add(it) })

    listenShellString(line, processor)

    var i = 0
    val result = StringBuilder()
    for ((name, start, stop) in substitutions) {
        result.append(line.substring(i..start - 1))
        i = stop + 1

        result.append(env(name))
    }

    result.append(line.substring(i..line.length - 1))

    return result.toString()
}
