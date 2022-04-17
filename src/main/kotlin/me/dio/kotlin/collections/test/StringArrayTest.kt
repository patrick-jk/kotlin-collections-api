package me.dio.kotlin.collections.test

fun main() {
    val names = Array(3) {""}
    names[0] = "Ozzy"
    names[1] = "Robert"
    names[2] = "Jimmy"

    for (name in names) {
        println(name)
    }

    println("----------------------")
    names.sort()
    names.forEach { println(it) }

    println("----------------------")
    val names2 = arrayOf("Ozzy", "Robert", "Jimmy")
    names2.sort()
    names2.forEach { println(it) }
}