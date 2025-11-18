package com.kimbh.ct_solutions.problems.hash

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
fun main() {

}

fun solution(nums: IntArray): Int {
    val n = nums.size / 2
    val kinds = nums.toList().groupingBy { it }.eachCount().size
    return minOf(n, kinds)
}