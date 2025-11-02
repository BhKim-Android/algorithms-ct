package com.kimbh.ct_solutions.problems.chap2

/**
 * 주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1을, 존재하지 않으면 0을 반환하는 함수 func2(int arr[], int N)을 작성하라.
 * arr의 각 수는 0이상 100 이하이고 N은 1000 이하이다.
 **/
class Bakingdog_chap02_1031_2 {
    fun solution(arr: IntArray): Int {
        val sortList = arr.sorted().toMutableList()
        var left = 0
        var right = sortList.size - 1
        while (left < right) {
            val sum = sortList[left] + sortList[right]
            if (sum == 100) return 1
            else if (sum < 100) left++
            else right--
        }
        return 0
    }
}