package com.example.leetcode

fun subtractProductAndSum(n: Int): Int {

    var sum = 0
    var product = 0
    val input = n.toString().map { it.toString().toInt() }

    for (i in input.indices) {
        sum += input[i]
        if (i == 0) product = input[i] else product *= input[i]
    }

    return product - sum
}

fun main() {
    println(subtractProductAndSum(705))
}