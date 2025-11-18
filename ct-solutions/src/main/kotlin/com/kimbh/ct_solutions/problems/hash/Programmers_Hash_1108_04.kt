package com.kimbh.ct_solutions.problems.hash

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 **/
fun main() {

}

// a = 2, b = 2, c = 2
// a + b + a + (a*b)+(a*c)+(b*c)+(a*b*c)
fun solution(clothes: Array<Array<String>>): Int {
    return clothes.groupingBy { it[1] }.eachCount().values.reduce { acc, i ->
        acc * (i + 1)
    } - 1
}