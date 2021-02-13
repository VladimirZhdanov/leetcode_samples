package com.example.leetcode

fun reverseString(s: CharArray) {
    var start = 0
    var end = s.lastIndex
    while (start < end) {
        s[start] = s[end].also {
            s[end] = s[start]
        }
        start++
        end--
    }
}

fun test() {
    var a = 1
    var b = 2
    var c = 3

    a = b.also { c = a.also { b = c } }

    //a 2 b 3  c 1
    println("a = $a, b = $b, c = $c")
}

fun main() {
    test()
}