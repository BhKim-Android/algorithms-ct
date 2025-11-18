package com.kimbh.ct_solutions.problems.greedy

/**
 * https://www.acmicpc.net/problem/2217
 */
fun main() {

}

fun solution(s: String): String {
    var max = ""
    s.split(" ").forEach {
        if (max.length < it.length && it.length % 2 == 0) {
            max = it
        }
    }
    return max
}
