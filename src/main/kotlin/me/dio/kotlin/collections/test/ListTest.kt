package me.dio.kotlin.collections.test

import me.dio.kotlin.collections.domain.Employee

fun main() {
    val employee = Employee("Jonathan",3000.0, "PF")
    val employee2 = Employee("Joseph", 2000.0, "PJ")
    val employee3 = Employee("Jotaro", 4000.0, "PF")

    val employees = listOf(employee, employee2, employee3)

    employees.forEach(::println)

    println("-------------------")
    println(employees.find { it.name == "Jotaro" })

    println("-------------------")
    employees
        .sortedBy { it.salary }
        .forEach(::println)

    println("-------------------")
    employees
        .groupBy { it.contractType }
        .forEach { println(it) }

}