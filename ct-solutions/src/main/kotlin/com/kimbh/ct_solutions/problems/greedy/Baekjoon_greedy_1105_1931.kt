package com.kimbh.ct_solutions.problems.greedy

/**
 * https://www.acmicpc.net/problem/1931
 **/

fun main() {
    // 입력 받기
    val n = readln().toInt()
    val meetings = Array(n) {
        val (start, end) = readln().split(" ").map { it.toInt() }
        start to end
    }

    var count = 0
    var preEnd = 0

    meetings.sortedWith(compareBy({ it.second }, { it.first }))
        .forEach {
            if (preEnd < it.first) {
                preEnd = it.second
                count++
            }
        }

    println(count)
}