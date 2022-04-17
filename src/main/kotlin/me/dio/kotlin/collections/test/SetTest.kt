package me.dio.kotlin.collections.test

import me.dio.kotlin.collections.domain.Employee

fun main() {
    val employee = Employee("Jonathan",2000.0, "PF")
    val employee2 = Employee("Joseph", 1500.0, "PJ")
    val employee3 = Employee("Jotaro", 4000.0, "PF")

    val employees1 = setOf(employee, employee2)
    val employees2 = setOf(employee3)

    val resultUnion = employees1.union(employees2)
    resultUnion.forEach { println(it) }

    println("-----------------")
    val employees3 = setOf(employee, employee2, employee3)
    val resultSubtract = employees3.subtract(employees2)
    resultSubtract.forEach { println(it) }

    println("-----------------")
    val resultIntersect = employees3.intersect(employees2)
    resultIntersect.forEach { println(it) }
}