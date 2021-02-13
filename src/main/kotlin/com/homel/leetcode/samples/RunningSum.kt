package com.example.leetcode

fun runningSum(nums: IntArray): IntArray {
    for (i in nums.indices) {
        if (i > 0) nums[i] = nums[i] + nums[i - 1]
    }
    return nums
}

fun main() {
    for (item in runningSum(intArrayOf(1, 2, 3, 4))) {
        println(item)
    }
}