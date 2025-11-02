package com.kimbh.ct_solutions.problems.chap4

/**
 * 주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1을, 존재하지 않으면 0을 반환하는 함수 fun(int arr[], int N)을 작성하라.
 * arr의 각 수는 0이상 100 이하이고 N은 1000이하이다.
 *
 * O(N)만큼의 시간복잡도로 풀기.
 **/
class Bakingdog_chap04_1031_3 {
    fun solution(arr: IntArray): Int {
        val appearArr = Array(101) {0}
        arr.forEach {
            val target = 100 - it
            if (appearArr[target] == 1) {
                return 1
            }
            appearArr[it] += 1
        }
        return 0
    }
}