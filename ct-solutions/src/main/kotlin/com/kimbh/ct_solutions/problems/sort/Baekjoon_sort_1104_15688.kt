package com.kimbh.ct_solutions.problems.sort

/**
 * https://www.acmicpc.net/problem/15688
 */

fun main() {
    val n = readln().toInt()
    val arr = IntArray(n) { readln().toInt() }

    countingSort(arr)

    for (num in arr) {
        println(num)
    }
}

fun countingSort(arr: IntArray) {

}

fun minusSort(arr: IntArray) {

}

fun plusSort() {

}