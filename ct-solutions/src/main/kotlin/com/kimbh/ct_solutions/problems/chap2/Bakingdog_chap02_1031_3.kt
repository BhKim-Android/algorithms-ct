package com.kimbh.ct_solutions.problems.chap2

import kotlin.math.sqrt

/**
 * N이 제곱수이면 1을 반환하고 제곱수가 아니면 0을 반환하는 함수 func3(int N)을 작성하라. N은 10억 이하의 자연수이다.
 **/
class Bakingdog_chap02_1031_3 {
    fun solution(n: Int): Int {
        var root = 1
        while (root * root <= n) {
            if (root * root == n) return 1
            root++
        }
        return 0
    }
}