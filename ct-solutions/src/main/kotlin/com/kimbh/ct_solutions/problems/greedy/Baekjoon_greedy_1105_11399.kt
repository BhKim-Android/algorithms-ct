package com.kimbh.ct_solutions.problems.greedy

/**
 * https://www.acmicpc.net/problem/11399
 **/

//5
//3 1 4 3 2
fun main() {
    val n = readln().toInt()
    val times = readln().split(" ").map { it.toInt() }.toIntArray()

    var sumMinute = 0
    var total = 0
    // 이후 여기에 로직 작성
    times.sorted().forEach {
        sumMinute += it
        total += sumMinute
    }

    println(total)
}