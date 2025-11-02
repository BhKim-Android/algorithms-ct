package com.kimbh.ct_solutions.problems.chap2

/**
 * N이하의 수 중에서 가장 큰 2의 거듭제곱수를 반환하는 함수 func4(int N)을 작성하라. N은 10억 이하의 자연수이다.
 */
class Bakingdog_chap02_1031_4 {
    fun solution(n: Int): Int {
        var answer = 2
        while (answer * 2 < n) {
            answer *= 2
        }
        return answer
    }
}