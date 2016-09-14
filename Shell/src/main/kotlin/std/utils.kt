package std

import ru.mit.spbau.softwaredesign.shell.Environment
import ru.mit.spbau.softwaredesign.shell.utils.ArgumentsException

val STD_COMMANDS = hashMapOf(
        Pair("wc", ::wc),
        Pair("cat", ::cat),
        Pair("echo", ::echo),
        Pair("exit", ::exit),
        Pair("pwd", ::pwd)
)

fun cat(args: Array<String>, input: String): Pair<Int, String> {
    if (args.size != 1) {
        throw ArgumentsException("cat", 1, args.size)
    }

    val file = Environment.readFile(args[0])
    return Pair(0, file)
}

fun wc(args: Array<String>, input: String): Pair<Int, String> {
    val wordCount = (when (args.size) {
        0 -> input.split(" ").size
        1 -> Environment.readFile(args[1]).split(" ").size
        else -> throw ArgumentsException("wc", 0, args.size)
    }).toString()

    return Pair(0, wordCount)
}

fun pwd(args: Array<String>, input: String): Pair<Int, String> {
    if (args.size != 0) {
        throw ArgumentsException("pwd", 0, args.size)
    }

    val path = Environment.path.absolutePath
    return Pair(0, path)
}

fun echo(args: Array<String>, input: String): Pair<Int, String> {
    return Pair(0, args.joinToString(" "))
}

fun exit(args: Array<String>, input: String): Pair<Int, String> {
    if (args.size != 0) {
        throw ArgumentsException("exit", 0, args.size)
    }

    return Pair(1, "")
}
