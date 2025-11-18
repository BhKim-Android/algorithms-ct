package com.kimbh.ct_solutions.problems.dp
/**
 * https://www.acmicpc.net/problem/9095
 */
fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val dp = IntArray(n + 1)
        dp[1] = 1
        dp[2] = 2
        dp[3] = 4

        (4..n).forEach {
            dp[it] = dp[it - 3] + dp[it - 2] + dp[it - 1]
        }
        println(dp[n])
    }
}
