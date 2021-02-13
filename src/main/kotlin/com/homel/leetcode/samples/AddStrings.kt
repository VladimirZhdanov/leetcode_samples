package com.example.leetcode

object Solution {
   // fun addStrings(num1: String, num2: String) = (num1.toBigInteger() + num2.toBigInteger()).toString()

    fun addStrings(num1: String, num2: String): String {
        var i = num1.length - 1
        var j = num2.length - 1
        var carry = 0
        val sb = StringBuilder()
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) carry +=  Character.getNumericValue(num1[i--])
            if (j >= 0) carry += Character.getNumericValue(num2[j--])
            sb.append(carry % 10)
            carry /= 10
        }
        return sb.reverse().toString()
    }
}

fun main() {
    val result = Solution.addStrings("115", "55555")
    println(result)
}