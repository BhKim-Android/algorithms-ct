package com.kimbh.ct_solutions.problems.hash

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
fun main() {

}

// chatGpt 코드..
//fun solution(participant: Array<String>, completion: Array<String>): String {
//    val completionMap = completion.groupingBy { it }.eachCount().toMutableMap()
//
//    return participant.first {
//        completionMap[it] = (completionMap[it] ?: 0) - 1
//        completionMap[it]!! < 0
//    }
//}

fun solution(participant: Array<String>, completion: Array<String>): String {
//    participant.sort()  // O(NlogN)
//    completion.sort()
//
//    completion.forEachIndexed { index, name ->
//        if (name != participant[index]) {
//            return participant[index]
//        }
//    }
//
//    return participant.last()
    var answer = ""
    var completionMap = mutableMapOf<String, Int>()
    completion.forEach {
        completionMap[it] = (completionMap[it] ?: 0) + 1
    }

    participant.forEach {
        if (completionMap[it] == 0 || completionMap[it] == null) {
            answer = it
        } else {
            completionMap[it] = (completionMap[it] ?: 0) - 1
        }
    }
    return answer
}

