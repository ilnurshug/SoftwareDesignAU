package ru.spbau.mit.softwaredesign.shell

import ru.spbau.mit.softwaredesign.shell.utils.VariableUndefinedException
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStreamReader

/**
 * Shell environment.
 * Store for local vars and path.
 */
object Environment {
    var path = File("")
        private set

    private val vars = hashMapOf<String, String>()

    /**
     * Read variable from context
     * @param name: variable name
     * @return variable content
     */
    operator fun get(name: String): String {
        return vars[name] ?: throw VariableUndefinedException(name)
    }

    /**
     * Write variable to context
     * @param name: variable name
     * @return variable content
     */
    operator fun set(name: String, content: String) {
        vars[name] = content
    }

    /**
     * Read file from current path
     * @param file: related name
     * @return file content
     */
    fun readFile(file: String): String {
        val file = File("${path.absolutePath}/$file")
        if (file.exists().not()) {
            throw FileNotFoundException()
        }

        return InputStreamReader(file.inputStream()).readText()
    }
}
