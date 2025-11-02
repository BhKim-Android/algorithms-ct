package com.kimbh.ct_solutions.problems.chap2

/**
 * N 이하의 자연수 중에서 3의 배수이거나 5의 배수인 수를 모두 합한 값을 반환하는 함수 func1(int N)을 작성하라. N은 10만 이하의 자연수이다.
 **/
class Bakingdog_chap02_1031_1 {
    fun solution(n: Int): Int {
        return (1..n).sumOf {
            if (it % 3 ==0 || it % 5 == 0) it
            else 0
        }
    }
}