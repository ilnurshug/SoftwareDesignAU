package ru.spbau.mit.softwaredesign.shell.std

import com.jshmrsn.karg.Arguments
import com.jshmrsn.karg.RawArguments


class GrepArgumentParser(rawArgs: RawArguments) : Arguments(rawArgs,
        name = "grep",
        description = "grep arguments") {
    val caseInsensitive = optionalFlag(
            name = "case insensitive",
            shortNames = listOf('i'),
            description = "ignore case",
            default = false
    )

    val word = optionalFlag(
            name = "word match",
            shortNames = listOf('w'),
            description = "filter exact words",
            default = false
    )

    val printAfter = optionalParameter(
            name = "print after",
            shortNames = listOf('A'),
            description = "print N lines after match"
    )

    val pattern = positionalArguments(minCount = 1, maxCount = 2)
}