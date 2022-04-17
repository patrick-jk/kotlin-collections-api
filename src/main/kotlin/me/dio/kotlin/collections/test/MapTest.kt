package me.dio.kotlin.collections.test

fun main() {
    val pair: Pair<String, Double> = Pair("Jonathan", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Key: $k - Value: $v") }

    val map2 = mapOf("Joseph" to 2500.0, "Jotaro" to 3000.0)

    map2.forEach { (k, v) -> println("Key: $k - Value: $v") }
}