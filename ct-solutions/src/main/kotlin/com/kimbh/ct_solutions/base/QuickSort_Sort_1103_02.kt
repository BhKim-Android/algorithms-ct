package com.kimbh.ct_solutions.base

import kotlin.math.sqrt

fun swap(arr: IntArray, left: Int, right: Int) {
    val tmp = arr[left]
    arr[left] = arr[right]
    arr[right] = tmp
}

fun quickSort(arr: IntArray, start: Int, end: Int) {
    if (start >= end) return
    val pivot = start
    var left = start + 1
    var right = end

    while (left <= right) {
        while (arr[left] <= arr[pivot] && left <= end) left++
        while (arr[right] > arr[pivot] && right > start) right--

        if (left > right) {
            swap(arr, pivot, right)
        } else {
            swap(arr, left, right)
        }
    }

    quickSort(arr, start, right)
    quickSort(arr, right + 1, end)
}

fun main() {
    val arr = intArrayOf(3, 9, 4, 7, 5, 0, 1, 6, 8, 2)
    println(arr.joinToString(" "))
    quickSort(arr, 0, arr.size - 1)
    println("sort : ${arr.joinToString(" ")}")

}