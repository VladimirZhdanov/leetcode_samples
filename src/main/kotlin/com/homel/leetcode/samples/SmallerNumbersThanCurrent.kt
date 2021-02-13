package com.example.leetcode

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {

    val result = IntArray(nums.size)
    var count = 0

    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] > nums[j]) count++
        }
        result[i] = count
        count = 0
    }

    return result
}

fun main() {
    for (item in smallerNumbersThanCurrent(intArrayOf(8,1,2,2,3))) {
        println(item)
    }
}