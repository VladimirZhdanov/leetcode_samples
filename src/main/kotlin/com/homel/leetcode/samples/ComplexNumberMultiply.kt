package com.example.leetcode

fun complexNumberMultiply(s1: String, s2: String): String {

    val (a1, b1) = s1.subSequence(0, s1.length - 1).split("+").map { it.toInt() }
    val (a2, b2) = s2.subSequence(0, s2.length - 1).split("+").map { it.toInt() }

    return "${(a1 * a2 - b1 * b2)}+${a1 * b2 + a2 * b1}i"
}

fun main() {
    println(complexNumberMultiply("1+1i", "1+1i"))
    println(complexNumberMultiply("1+-1i", "0+0i"))
}
