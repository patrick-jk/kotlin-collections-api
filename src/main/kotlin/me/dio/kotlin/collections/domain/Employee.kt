package me.dio.kotlin.collections.domain

data class Employee(val name: String, val salary: Double, val contractType: String) {
    override fun toString(): String =
        """
           Name: $name 
           Salary: $salary
           Contract Type: $contractType
        """.trimIndent()
}
