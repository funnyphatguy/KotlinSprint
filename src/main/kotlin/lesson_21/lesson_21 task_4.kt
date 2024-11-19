package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("textFile.txt")


    file.addTextInFile("ЭТО ВТОРОЕ")
    file.addTextInFile("ЭТО ПЕРВОЕ")

}

fun File.addTextInFile(message: String) {

    createNewFile()
    val newMess = readText()
    val mess = "$message $newMess"

    writeText(mess.lowercase())

}


