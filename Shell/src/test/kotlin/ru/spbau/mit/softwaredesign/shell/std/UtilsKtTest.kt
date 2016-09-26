package ru.spbau.mit.softwaredesign.shell.std

import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.File

class UtilsKtTest {
    @Test
    fun cat() {
        val content = File("gradlew.bat").readText()
        assertEquals(content, cat(arrayOf("gradlew.bat"), "").second)
    }

    @Test
    fun wc() {
        val test1 = "hello, world"
        val test2 = "one two three four five six seven eight nine ten"

        assertEquals("2", wc(arrayOf(), test1).second)
        assertEquals("10", wc(arrayOf(), test2).second)
    }

    @Test
    fun pwd() {
        assertEquals(File("").absolutePath, pwd(arrayOf(), "").second)
    }

    @Test
    fun echo() {
        assertEquals("5 4 3 2 1", echo(arrayOf("5 4 3 2 1"), "").second)
        assertEquals("'sdsds' 'sdsd' 1", echo(arrayOf("'sdsds' 'sdsd' 1"), "").second)
    }

    @Test
    fun exit() {
        assertEquals(1, exit(arrayOf(), "").first)
    }

    @Test
    fun grep() {
        assertEquals("", grep(arrayOf("hello"), "Hello, world").second)
        assertEquals("Hello, world\n", grep(arrayOf("Hello"), "Hello, world").second)
        assertEquals("Hello, world\n", grep(arrayOf("^Hello"), "Hello, world").second)
        assertEquals("", grep(arrayOf("Hello$"), "Hello, world").second)
        assertEquals("Hello, world\n", grep(arrayOf("-i", "HELLO"), "Hello, world").second)
        assertEquals("", grep(arrayOf("HELLO"), "Hello, world").second)
        assertEquals("Hello\n", grep(arrayOf("-i", "-w", "HELLO"), "Hello, world").second)
    }

}