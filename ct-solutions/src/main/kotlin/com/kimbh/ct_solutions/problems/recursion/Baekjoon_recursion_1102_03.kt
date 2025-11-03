package com.kimbh.ct_solutions.problems.recursion

/**
 * https://www.acmicpc.net/problem/11729
 **/
fun main() {
    Baekjoon_recursion_1102_03().solution(2, 1, 1)  // 3
    Baekjoon_recursion_1102_03().solution(2, 3, 1)  // 11
    Baekjoon_recursion_1102_03().solution(3, 7, 7)  // 63
}

class Baekjoon_recursion_1102_03 {
    /**
     * n = 2, r = 0, c = 0
     * @return : 0
     * n = 2, r = 0, c = 1
     * @return : 1
     * n = 2, r = 1, c = 0
     * @return : 2
     * n = 3, r = 1, c = 1
     * @return : 3
     **/
    fun solution(n: Int, r: Int, c: Int) {
        zCount(n, Array(n) { IntArray(n) })
    }


    /**
     * arr[0][0] = 0
     * arr[0][1] = 1
     * arr[1][0] = 2
     * arr[1][1] = 3
     */
    private fun zCount(n: Int, arr: Array<IntArray>) {
        if (n < 2) return

        arr[n - 2][n - 2] = n - 2
        arr[n - 2][n - 1] = n - 1
        arr[n - 1][n - 2] = n
        arr[n - 1][n - 1] = n + 1

        println(arr.joinToString("\n") { row ->
            row.joinToString(" ")
        })

        zCount(n - 1, Array(n - 1) { IntArray(n - 1) })
    }
}