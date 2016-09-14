package ru.mit.spbau.softwaredesign.shell

import ru.mit.spbau.softwaredesign.shell.pipeline.AssignmentNode
import ru.mit.spbau.softwaredesign.shell.pipeline.CommandNode
import ru.mit.spbau.softwaredesign.shell.pipeline.ExecutableNode
import ru.mit.spbau.softwaredesign.shell.pipeline.Pipeline
import ru.mit.spbau.softwaredesign.shell.utils.CommandNotFoundException
import ru.mit.spbau.softwaredesign.shell.utils.NonZeroResultException
import ru.mit.spbau.softwaredesign.shell.utils.UnknownNodeType

object Executor {
    private val commands = mutableMapOf<String, (Array<String>, String) -> Pair<Int, String>>()

    fun register(name: String, command: (Array<String>, String) -> Pair<Int, String>) {
        commands[name] = command
    }

    fun executePipeline(pipeline: Pipeline): Pair<Int, String> {
        var result = Pair(0, "")

        try {
            result = runExecutionLoop(pipeline)
        } catch (e: UnknownNodeType) {
            throw e
        } catch (e: Exception) {
            println(e.message!!)
        }

        return result
    }

    private fun runExecutionLoop(pipeline: Pipeline): Pair<Int, String> {
        var result = Pair(0, "")

        for (command in pipeline.commands) {
             result = execute(command, result.second)

            if (result.first != 0) {
                if (result.first < 0) {
                    throw NonZeroResultException(command.toString(), result.first)
                }

                return result
            }
        }

        return result
    }

    private fun execute(command: ExecutableNode, input: String): Pair<Int, String> {
        return when (command) {
            is AssignmentNode -> {
                Environment[command.variable] = command.content
                Pair(0, input)
            }
            is CommandNode -> {
                val call = commands[command.name] ?: throw CommandNotFoundException(command.name)
                call.invoke(command.args, input)
            }
            else -> throw UnknownNodeType(command.toString())
        }
    }
}

