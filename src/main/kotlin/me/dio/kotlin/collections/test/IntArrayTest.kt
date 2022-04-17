package me.dio.kotlin.collections.test

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (value in values) {
        println(value)
    }

    println("-----------------------------")
    values.forEach { value ->
        println(value)
    }

    println("-----------------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("-----------------------------")
    values.sort()
    for (value in values) {
        println(value)
    }
}