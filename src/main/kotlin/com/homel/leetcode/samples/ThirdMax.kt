package com.example.leetcode

fun thirdMax(nums: IntArray): Int {

    val set = sortedSetOf<Int>()
    nums.forEach {
        set.add(it)
        if (set.size > 3) set.remove(set.first())
    }
    val max = if (set.size > 2) set.first() else set.last()
    return max

   /* var temp = 0
    var count = 0

    if (nums.size == 3) return nums[2]

    for (i in nums.indices) {
        count++
        if (i != nums.size - 1 && nums[i] == nums[i + 1])  {
            temp++
            count--
        }
        if (count == 3) return nums[i]
    }

    return nums.last()*/
}

fun main() {
    println(thirdMax(intArrayOf(1, 1, 2, 3)))
    println(thirdMax(intArrayOf(1, 2)))
}