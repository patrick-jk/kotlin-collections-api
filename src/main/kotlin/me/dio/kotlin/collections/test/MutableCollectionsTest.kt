package me.dio.kotlin.collections.test

import me.dio.kotlin.collections.domain.Employee

fun main() {
    val employee = Employee("Jonathan",2000.0, "PF")
    val employee2 = Employee("Joseph", 1500.0, "PJ")
    val employee3 = Employee("Jotaro", 4000.0, "PF")

    println("--------- LIST ---------")
    val employees = mutableListOf(employee, employee3)
    employees.forEach { println(it) }

    println("------------------")
    employees.add(employee2)
    employees.forEach { println(it) }

    println("------------------")
    employees.remove(employee)
    employees.forEach { println(it) }

    println("--------- SET ---------")
    val employeeSet = mutableSetOf(employee)
    employeeSet.forEach { println(it) }

    println("------------------")
    employeeSet.add(employee2)
    employeeSet.add(employee3)
    employeeSet.forEach { println(it) }

    println("------------------")
    employeeSet.remove(employee3)
    employeeSet.forEach { println(it) }
}