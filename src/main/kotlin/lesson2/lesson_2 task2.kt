package org.example.lesson2

fun main() {

    val numberOfWorkers = 50
    val workersSalary = 30000
    val numberOfInterns = 30
    val internsSalary = 20000


    val allWorkersSalary = workersSalary * numberOfWorkers
    println(allWorkersSalary)

    val overallSalary = allWorkersSalary + (internsSalary * numberOfInterns)
    println(overallSalary)

    val averageSalary = overallSalary / (numberOfWorkers + numberOfInterns)
    println(averageSalary)


}