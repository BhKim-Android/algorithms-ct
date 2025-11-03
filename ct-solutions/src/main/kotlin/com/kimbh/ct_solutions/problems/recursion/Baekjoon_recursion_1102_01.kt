package com.kimbh.ct_solutions.problems.recursion

/**
 * https://www.acmicpc.net/problem/1926
 **/
class Baekjoon_recursion_1102_01 {
    fun solution(a: Long, b: Long, c: Long): Long {
        return recursion(a, b, c)
    }

    private fun recursion(a: Long, b: Long, c: Long): Long {
        if (b == 0L) return 1L
        val half = recursion(a, b / 2, c)
        return if (b % 2L == 0L) {
            (half * half) % c
        } else {
            (half * half % c * a) % c
        }
    }
}