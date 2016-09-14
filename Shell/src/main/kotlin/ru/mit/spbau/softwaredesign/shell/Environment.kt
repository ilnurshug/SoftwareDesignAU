package ru.mit.spbau.softwaredesign.shell

import ru.mit.spbau.softwaredesign.shell.utils.VariableUndefinedException
import java.io.File
import java.io.InputStreamReader

object Environment {
    var path = File("")
        private set

    private val vars = hashMapOf<String, String>()

    operator fun get(name: String): String {
        return vars[name] ?: throw VariableUndefinedException(name)
    }

    operator fun set(name: String, content: String) {
        vars[name] = content
    }

    fun readFile(file: String): String {
        val file = File("${path.absolutePath}/$file").inputStream()
        return InputStreamReader(file).readText()
    }
}
