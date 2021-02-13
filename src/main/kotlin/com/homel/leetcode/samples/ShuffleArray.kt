package com.example.leetcode

fun shuffle(nums: IntArray, n: Int): IntArray {
    val result: MutableList<Int> = ArrayList()

    var j = n

    for (i in 0 until n) {
        result.add(nums[i])
        result.add(nums[j])
        j++
    }
    return result.toIntArray()
}

fun main() {
    val result = shuffle(intArrayOf(1, 2, 3, 4, 5, 6), 3)
    for (i in result) {
        println(i)
    }
}