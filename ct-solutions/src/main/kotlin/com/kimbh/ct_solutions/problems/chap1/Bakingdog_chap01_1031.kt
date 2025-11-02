package com.kimbh.ct_solutions.problems.chap1

/**
 * 10 이하의 두 자연수가 한 줄에 공백을 사이에 두고 주어진다.
 * 두 자연수를 합한 결과를 출력하라.
 *
 * 입력 예시 1
 * 3 6
 * 출력 예시 1
 * 9
 */
class Bakingdog_chap01_1031 {
    fun solution(num: String): Int {
        return num.split(" ").sumOf {
            it.toInt()
        }
    }
}