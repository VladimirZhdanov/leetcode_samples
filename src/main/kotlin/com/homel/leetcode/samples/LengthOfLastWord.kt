package com.example.leetcode

fun lengthOfLastWord(s: String): Int {
    val array = s.split(" ")
    if (array.size > 1 && array.last().isEmpty()) {
        val tempArray = findNotEmpty(array)
        if (tempArray.isEmpty()) {
            return 0
        }
        return tempArray.last().length
    }
    if (array.isNotEmpty()) {
        return array.last().length
    }
    return 0
}

fun findNotEmpty(array: List<String>): List<String> {
   return array.filter {
        it.isNotEmpty()
    }.toList()
}

fun main() {
    val result = lengthOfLastWord("wf wefwef    ")
    println(result)
}