package me.dio.kotlin.collections.test

fun main() {
    val salaries = DoubleArray(3)
    salaries[0] = 1000.0
    salaries[1] = 3000.0
    salaries[2] = 500.0

    salaries.forEach { println(it) }

    println("-----------------------------------")
    salaries.forEachIndexed { index, salary ->
        salaries[index] = salary * 1.1
    }
    salaries.forEach { println(it) }

    println("-----------------------------------")
    val salaries2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salaries2.sort()
    salaries2.forEach { println(it) }
}