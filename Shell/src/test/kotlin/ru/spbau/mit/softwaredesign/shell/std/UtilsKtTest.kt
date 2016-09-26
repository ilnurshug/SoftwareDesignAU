package ru.spbau.mit.softwaredesign.shell.std

import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.File
import java.nio.file.Paths

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

    @Test
    fun ls() {
        val res = """${File("").absolutePath}:
settings.gradle
gradlew.bat
.gitignore
build.gradle
README.md
gradlew
gradle
build
.gradle
.idea
src"""

        assertEquals(res, ls(arrayOf(), "").second)

        val res2 = """src/main:
antlr
kotlin

build:
classes
tmp
generated-src
reports
dependency-cache
test-results
libs
kotlin-classes"""

        assertEquals(res2, ls(arrayOf("src/main", "build"), "").second)
    }

    @Test
    fun cd() {
        val currentPath = Paths.get("")
        val srcPath = Paths.get("src")
        val srcMainPath = Paths.get("src/main")

        cd(arrayOf("src/main"), "")
        assertEquals(srcMainPath.toAbsolutePath().toString(), pwd(arrayOf(), "").second)

        cd(arrayOf(".."), "")
        assertEquals(srcPath.toAbsolutePath().toString(), pwd(arrayOf(), "").second)

        cd(arrayOf(".."), "")
        assertEquals(currentPath.toAbsolutePath().toString(), pwd(arrayOf(), "").second)
    }
}