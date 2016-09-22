package ru.spbau.mit.softwaredesign.shell

import ru.spbau.mit.softwaredesign.shell.utils.DirNotFoundException
import ru.spbau.mit.softwaredesign.shell.utils.VariableUndefinedException
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStreamReader
import java.nio.file.Paths

/**
 * Shell environment.
 * Store for local vars and path.
 */
object Environment {
    val path: String
        get() = System.getProperty("user.dir")


    private val vars = hashMapOf<String, String>()

    /**
     * Change user's working directory
     * @param dir directory name
     */
    fun changeDir(dir: String) {
        val path = Paths.get(path).resolve(dir).normalize().toAbsolutePath()

        if (!File(path.toString()).isDirectory) {
            throw DirNotFoundException(dir)
        }

        System.setProperty("user.dir", path.toString())
    }

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
    fun readFile(file: String): String? {
        val file = File("${path}/$file")
        if (file.exists().not()) {
            return null
        }

        return InputStreamReader(file.inputStream()).readText()
    }

    fun listFilesInDir(dir: String = Environment.path): List<String> =
            File(dir).listFiles { f -> !f.isDirectory }.map { it.name }

    fun listDirs(dir: String = Environment.path): List<String> =
            File(dir).listFiles { f -> f.isDirectory }.map { it.name }
}
