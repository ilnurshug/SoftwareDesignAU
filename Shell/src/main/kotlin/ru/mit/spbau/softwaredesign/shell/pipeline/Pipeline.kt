package ru.mit.spbau.softwaredesign.shell.pipeline

interface ExecutableNode {}

class AssignmentNode(val variable: String, val content: String) : ExecutableNode {}

class CommandNode(val name: String, val args: Array<String>) : ExecutableNode {}

data class Pipeline(val commands: List<ExecutableNode>)
