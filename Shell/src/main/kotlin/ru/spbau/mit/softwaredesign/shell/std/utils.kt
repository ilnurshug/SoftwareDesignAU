package ru.spbau.mit.softwaredesign.shell.std

import ru.spbau.mit.softwaredesign.shell.Environment
import ru.spbau.mit.softwaredesign.shell.utils.ArgumentsException

/**
 * Immutable index of embed commands.
 */
val STD_COMMANDS = hashMapOf(
        Pair("wc", ::wc),
        Pair("cat", ::cat),
        Pair("echo", ::echo),
        Pair("exit", ::exit),
        Pair("pwd", ::pwd)
)

/**
 * Cat file
 * @param args array of arguments
 * @param input stdin
 * @return pair of exit code and stdout
 */
fun cat(args: Array<String>, input: String): Pair<Int, String> {
    if (args.size != 1) {
        throw ArgumentsException("cat", 1, args.size)
    }

    val file = Environment.readFile(args[0])
    return Pair(0, file)
}

/**
 * Word count
 * @param args array of arguments
 * @param input stdin
 * @return pair of exit code and stdout
 */
fun wc(args: Array<String>, input: String): Pair<Int, String> {
    val wordCount = (when (args.size) {
        0 -> input.split(" ").size
        1 -> Environment.readFile(args[1]).split(" ").size
        else -> throw ArgumentsException("wc", 0, args.size)
    }).toString()

    return Pair(0, wordCount)
}

/**
 * Current path
 * @param args array of arguments
 * @param input stdin
 * @return pair of exit code and stdout
 */
fun pwd(args: Array<String>, input: String): Pair<Int, String> {
    if (args.size != 0) {
        throw ArgumentsException("pwd", 0, args.size)
    }

    val path = Environment.path.absolutePath
    return Pair(0, path)
}

/**
 * @param args array of arguments
 * @param input stdin
 * @return pair of exit code and stdout
 */
fun echo(args: Array<String>, input: String): Pair<Int, String> {
    return Pair(0, args.joinToString(" "))
}

/**
 * @param args array of arguments
 * @param input stdin
 * @return pair of exit code and stdout
 */
fun exit(args: Array<String>, input: String): Pair<Int, String> {
    if (args.size != 0) {
        throw ArgumentsException("exit", 0, args.size)
    }

    return Pair(1, "")
}
