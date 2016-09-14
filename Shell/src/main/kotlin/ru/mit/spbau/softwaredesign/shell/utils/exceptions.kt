package ru.mit.spbau.softwaredesign.shell.utils

class ArgumentsException(command: String, expected: Int, occurred: Int)
    : Exception("$command: invalid arguments count. Expected $expected, occurred: $occurred")

class VariableUndefinedException(val name: String)
    : Exception("Variable $$name undefined")

class ParseException()
    : Exception("Invalid expression")

class NonZeroResultException(command: String, code: Int)
    : Exception("$command: Exit code $code")

class CommandNotFoundException(val name: String)
    : Exception("$name: not found")

class UnknownNodeType(type: String)
    : Exception("Unknown node type: $type")
