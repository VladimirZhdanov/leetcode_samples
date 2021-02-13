package com.example.leetcode

fun restoreString(s: String, indices: IntArray): String {

    val result = CharArray(s.length)

    for (i in indices.indices) {
        result[indices[i]] = s[i]
    }

    return result.joinToString("")
}

fun main() {
    println(restoreString( "codeleet", intArrayOf(4,5,6,7,0,2,1,3)))
}