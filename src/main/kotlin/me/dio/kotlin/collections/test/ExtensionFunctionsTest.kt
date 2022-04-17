package me.dio.kotlin.collections.test

import me.dio.kotlin.collections.service.average
import me.dio.kotlin.collections.service.sum

fun main() {
    val salaries = arrayOf("2000".toBigDecimal(), "1500".toBigDecimal(), "4000".toBigDecimal())

    println("---------------------")
    println(salaries.sum())

    println("---------------------")
    println(salaries.average())
}