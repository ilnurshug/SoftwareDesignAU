package ru.mit.spbau.softwaredesign.shell

import ru.mit.spbau.softwaredesign.shell.parser.expandMacroses
import ru.mit.spbau.softwaredesign.shell.pipeline.buildPipeline
import std.STD_COMMANDS

fun main(args: Array<String>) {
    STD_COMMANDS.forEach { name, command -> Executor.register(name, command) }

    while (true) {
        val pipeline = buildPipeline(expandMacroses(readLine()!!, { Environment[it] }))
        val result = Executor.executePipeline(pipeline)

        if (result.second.length > 0) {
            println(result.second)
        }

        if (result.first != 0) {
            return
        }
    }
}
