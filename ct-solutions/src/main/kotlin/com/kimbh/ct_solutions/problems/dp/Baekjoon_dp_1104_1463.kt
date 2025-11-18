package com.kimbh.ct_solutions.problems.dp

import kotlin.math.min

/**
 * https://www.acmicpc.net/problem/1463
 */
fun main() {
    val num = readln().toInt()
    println(solution(num))
}

fun solution(num: Int): Int {
    val dp = IntArray(num + 1)
    dp[1] = 0

    for (i in 2..num) {
        dp[i] = dp[i - 1] + 1

        if (dp[i] % 2 == 0) minOf(dp[i], dp[i / 2] + 1)
        if (dp[i] % 3 == 0) minOf(dp[i], dp[i / 3] + 1)
    }

    return dp[num]
}