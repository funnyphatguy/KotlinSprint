package org.example.lesson_17

//В приложении для хранения облачных файлов есть папки и файлы.
//
//Создай класс папки, который имеет имя, количество файлов и флаг “секретно”.
// Если флаг имеет значение true, то при попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0.
// В ином случае возвращать ее название и реальное количество файлов. Для реализации должны использоваться геттеры.
//
//Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.

class Folder(name: String, numberOfFiles: Int, confidential: Boolean) {

    var name = name
        get() = if (confidential) "Скрытая папка" else field
    var numberOfFiles = numberOfFiles
        get() = if (confidential) 0 else field
    var confidential = confidential

}

fun main() {

    val folderOne = Folder("Алешка", 47, true).also {
        println(it.name)
        println(it.numberOfFiles)
    }
}

