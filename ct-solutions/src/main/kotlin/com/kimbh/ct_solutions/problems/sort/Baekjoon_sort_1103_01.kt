package com.kimbh.ct_solutions.problems.sort

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

/**
 * https://www.acmicpc.net/problem/11728
 **/
fun solution(n: Int, m: Int, arrA: IntArray, arrB: IntArray): List<Int> {
    var aIndex = 0
    var bIndex = 0
    val mutableList = mutableListOf<Int>()

    while (aIndex < n && bIndex < m) {
        if (arrA[aIndex] < arrB[bIndex]) {
            mutableList.add(arrA[aIndex++])
        } else if (arrA[aIndex] > arrB[bIndex]) {
            mutableList.add(arrB[bIndex++])
        } else {
            mutableList.add(arrA[aIndex++])
            mutableList.add(arrB[bIndex++])
        }
    }

    while (aIndex < n) mutableList.add(arrA[aIndex++])
    while (bIndex < m) mutableList.add(arrB[bIndex++])

    return mutableList
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val arrA = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val arrB = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    println(solution(n, m, arrA, arrB))

    bw.write(solution(n, m, arrA, arrB).joinToString(" "))

    bw.flush()
    bw.close()
    br.close()
}