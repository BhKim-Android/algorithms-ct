//package com.kimbh.ct_solutions.base
//
//import java.io.*
//
//var n = 10
//var arr = intArrayOf(15, 25, 22, 357, 16, 23, -53, 12, 46, 3)
//var tmp = IntArray(1_000_001) // merge 함수에서 임시로 사용할 배열
//
//fun merge(st: Int, en: Int) {
//    val mid = (st + en) / 2
//    val aArr = arr.sliceArray(st until mid)
//    val bArr = arr.sliceArray(mid until en)
//
//    var aIndex = 0
//    var bIndex = 0
//    var tmpIndex = 0
//
//    while (aIndex < mid && bIndex < mid) {
//        if (aArr[aIndex] <= bArr[bIndex]) {
//            tmp[tmpIndex] = aArr[aIndex]
//            aIndex++
//        } else if (aArr[aIndex] > bArr[bIndex]) {
//            tmp[tmpIndex] = bArr[bIndex]
//            bIndex++
//        }
//        tmpIndex++
//    }
//
//    while (aIndex < bIndex) tmp[tmpIndex++] = aArr[aIndex++]
//    while (aIndex > bIndex) tmp[tmpIndex++] = bArr[bIndex++]
//
//    tmp.forEachIndexed { index, num ->
//        arr[index] = num
//    }
//}
//
//// arr[st:en]을 정렬하는 함수
//fun mergeSort(start: Int, end: Int) {
//    if (start == end) return
//    val mid = (start + end) / 2
//    mergeSort(start, mid)
//    mergeSort(mid, end)
//    merge(start, end)
//}
//
//fun main() {
//    mergeSort(0, n)
//    for (i in 0 until n) {
//        print("${arr[i]} ")
//    }
//}
