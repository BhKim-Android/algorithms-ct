package com.kimbh.ct_solutions.problems.greedy

/**
 * https://www.acmicpc.net/problem/11047
 */

fun main() {
    // 입력 받기
    val (n, k) = readln().split(" ").map { it.toInt() }
    val coins = IntArray(n) { readln().toInt() }

    var price = k
    var totalCount = 0
    (n - 1 downTo 0).forEach { index ->
        if (coins[index] <= price) {
            val count = price / coins[index]
            price = price - (coins[index] * count)
            totalCount += count
        }
    }

    println(totalCount)
}