package me.dio.kotlin.collections.test

fun main() {
    val salaries = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salary in salaries) {
        println(salary)
    }

    println("--------------------")
    println("Greater salary: ${salaries.maxOrNull()}")
    println("Smaller salary: ${salaries.minOrNull()}")
    println("Average salary: ${salaries.average()}")

    val salariesGreaterThan2500 = salaries.filter { it > 2500.0 }
    println("--------------------")
    salariesGreaterThan2500.forEach { println(it) }

    println("--------------------")
    println(salaries.count { it in 2000.0..5000.0 })

    println("--------------------")
    println(salaries.find { it == 2250.0 })
    println(salaries.find { it == 500.0 })
    println(salaries.find { it > 1500.0 })

    println("--------------------")
    println(salaries.any { it == 1000.0 })
    println(salaries.any { it == 500.0 })
}