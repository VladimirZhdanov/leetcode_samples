package com.example.leetcode

fun isPrefixOfWord(sentence: String, searchWord: String): Int {


    val words = sentence.toLowerCase().split(" ")

    for (item in words) {
        if (item.startsWith(searchWord)) {
            return  words.indexOf(item) + 1
        }
    }
    return -1
}

fun main() {
    println(isPrefixOfWord("i love eating burger", "burg"))
    println(isPrefixOfWord("this problem is an easy problem", "pro"))
    println(isPrefixOfWord("i am tired", "you"))
    println(isPrefixOfWord("i use triple pillow", "pill"))
    println(isPrefixOfWord("hello from the other side", "they"))
}