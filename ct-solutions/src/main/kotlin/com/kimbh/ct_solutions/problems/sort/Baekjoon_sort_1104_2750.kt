package com.kimbh.ct_solutions.problems.sort

fun main() {
    val n = readln().toInt()
    val arr = IntArray(n) { readln().toInt() }

    quickSort(arr, 0, n - 1)

    for (num in arr) {
        println(num)
    }
}

fun quickSort(arr: IntArray, start: Int, end: Int) {
    if (start >= end) return

    val pivot = start
    var left = start + 1
    var right = end

    while (left <= right) {
        while (arr[left] <= arr[pivot] && left < end) left++
        while (arr[right] > arr[pivot] && right >= start) right--

        if (left >= right) {
            swap(arr, pivot, right)
        } else {
            swap(arr, left, right)
        }
    }

    quickSort(arr, start, right - 1)
    quickSort(arr, right, end)
}

fun swap(arr: IntArray, aIndex: Int, bIndex: Int) {
    val tmp = arr[aIndex]
    arr[aIndex] = arr[bIndex]
    arr[bIndex] = tmp
}