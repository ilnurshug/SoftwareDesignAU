package ru.mit.spbau.softwaredesign.shell.std

import org.junit.Test
import org.junit.Assert.*
import java.io.File

class UtilsKtTest {
    @Test
    fun cat() {
        val content = File("gradlew.bat").readText()
        assertEquals(content, std.cat(arrayOf("gradlew.bat"), "").second)
    }

    @Test
    fun wc() {
        val test1 = "hello, world"
        val test2 = "one two three four five six seven eight nine ten"

        assertEquals("2", std.wc(arrayOf(), test1).second)
        assertEquals("10", std.wc(arrayOf(), test2).second)
    }

    @Test
    fun pwd() {
        assertEquals(File("").absolutePath, std.pwd(arrayOf(), "").second)
    }

    @Test
    fun echo() {
        assertEquals("5 4 3 2 1", std.echo(arrayOf("5 4 3 2 1"), "").second)
        assertEquals("'sdsds' 'sdsd' 1", std.echo(arrayOf("'sdsds' 'sdsd' 1"), "").second)
    }

    @Test
    fun exit() {
        assertEquals(1, std.exit(arrayOf(), "").first)
    }

}