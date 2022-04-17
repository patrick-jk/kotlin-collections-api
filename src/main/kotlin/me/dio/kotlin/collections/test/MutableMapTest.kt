package me.dio.kotlin.collections.test

import me.dio.kotlin.collections.domain.Employee
import me.dio.kotlin.collections.service.Repository

fun main() {
    val employee = Employee("Jonathan",2000.0, "PF")
    val employee2 = Employee("Joseph", 1500.0, "PJ")
    val employee3 = Employee("Jotaro", 4000.0, "PF")

    val repository = Repository<Employee>()

    repository.create(employee.name, employee)
    repository.create(employee2.name, employee2)
    repository.create(employee3.name, employee3)

    println(repository.findById(employee.name))

    println("----------------------")
    repository.remove(employee2.name)
    repository.findAll().forEach(::println)
}