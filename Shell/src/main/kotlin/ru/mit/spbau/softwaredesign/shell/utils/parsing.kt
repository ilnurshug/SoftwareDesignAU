package ru.mit.spbau.softwaredesign.shell.utils

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeListener
import org.antlr.v4.runtime.tree.ParseTreeWalker
import ru.mit.spbau.softwaredesign.shell.parser.ShellLexer
import ru.mit.spbau.softwaredesign.shell.parser.ShellParser

fun <T : ParseTreeListener> listenShellString(line: String, listener: T) {
    val lexer = ShellLexer(ANTLRInputStream(line.byteInputStream()))
    val parser = ShellParser(CommonTokenStream(lexer))
    ParseTreeWalker().walk(listener, parser.line())
}
