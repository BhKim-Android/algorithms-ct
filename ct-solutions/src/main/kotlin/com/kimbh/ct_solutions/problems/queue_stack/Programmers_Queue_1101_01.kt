package com.kimbh.ct_solutions.problems.queue_stack

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
class Programmers_Queue_1101_01 {
    fun solution(arr: IntArray): IntArray {
        // 연결리스트 사용..
        val linkedList = LinkedList()
        arr.forEach { linkedList.addItem(it) }

        // 스택 사용..
        val stack = ArrayDeque<Int>()

        return intArrayOf()
    }
}

class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null
    var tail: Node? = null

    fun addItem(item: Int) {
        val newNode = Node(item)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }
    }
}