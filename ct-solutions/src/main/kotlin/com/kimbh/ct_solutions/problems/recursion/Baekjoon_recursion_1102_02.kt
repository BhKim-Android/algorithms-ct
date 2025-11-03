package com.kimbh.ct_solutions.problems.recursion

/**
 * https://www.acmicpc.net/problem/11729
 **/
fun main() {
    Baekjoon_recursion_1102_02().solution(3)
}

class Baekjoon_recursion_1102_02 {
    fun solution(n: Int) {
        hanoi(n, 1, 2, 3)
    }

    fun hanoi(n: Int, start: Int, end: Int, aux: Int) {
        // 종료..
        if (n == 1) {
            println("$start $end")
            return
        }

        // 위의 원판을 보조로 이동.
        hanoi(n - 1, start, aux, end)

        // 가장 큰 원판 C로 이동
        println("$start $end")

        // 보조의 원판을 목표로 이동..
        hanoi(n - 1, aux, end, start)
    }
}