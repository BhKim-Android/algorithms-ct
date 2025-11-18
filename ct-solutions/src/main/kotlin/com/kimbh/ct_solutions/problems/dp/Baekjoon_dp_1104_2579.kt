package com.kimbh.ct_solutions.problems.dp

/**
 * https://www.acmicpc.net/problem/2579
 **/
fun main() {
    val n = readln().toInt() // 계단 개수
    val stairs = IntArray(n + 1) // 1-indexed로 처리하기 위함

    for (i in 1..n) {
        stairs[i] = readln().toInt()
    }

    val dp = Array(n + 1) { IntArray(2) }

//    dp[k][1] = dp[k-1] + stairs[k]
//    dp[k][2] = dp[k-2] + stairs[k]
}