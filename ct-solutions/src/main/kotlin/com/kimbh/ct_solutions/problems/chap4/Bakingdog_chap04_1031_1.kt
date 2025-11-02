package com.kimbh.ct_solutions.problems.chap4

class Bakingdog_chap04_1031_1 {
    fun insert(idx: Int, num: Int, arr: Array<Int>, len: Int): Int {
        var value = num
        (idx..len).forEach {
            val tmp = arr[it]
            arr[it] = value
            value = tmp
        }
        return len + 1
    }

    fun erase(idx: Int, arr: Array<Int>, len: Int): Int {
        (idx until len - 1).forEach {
            arr[it] = arr[it + 1]
        }
        return len - 1
    }

    fun printArr(arr: Array<Int>, len: Int) {
        for (i in 0 until len) print("${arr[i]} ")
        println("\n")
    }

    fun main() {
        val arr = Array(10) { 0 }
        var len = 6
        arr[0] = 10; arr[1] = 20; arr[2] = 30
        arr[3] = 40; arr[4] = 50; arr[5] = 60

        len = insert(3, 60, arr, len)
        len = erase(2, arr, len)
        printArr(arr, len)
    }
}