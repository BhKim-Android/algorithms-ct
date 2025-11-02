package com.kimbh.ct_solutions.problems.chap5

import java.util.LinkedList
import kotlin.math.PI

/**
 * 설명: 단일 연결리스트를 뒤집어 반환하라.
 *
 * 예시
 * 입력: 1 -> 2 -> 3 -> 4 -> 5
 * 출력: 5 -> 4 -> 3 -> 2 -> 1
 *
 * 제약: 노드 수 0 ≤ n ≤ 10^5
 **/

class Bakingdog_chap05_1031_1 {
    fun solution() {

    }
}

class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    private var head: Node? = null

    fun addItem(preNode: Node, data: Int) {
        val newNode = Node(data)

        head?.let {
            newNode.next = preNode.next
            preNode.next = newNode
        } ?: let {
            head = newNode
        }
    }

    fun removeNode(preNode: Node) {
        preNode.next?.next?.let {
            preNode.next = it
        }
    }

    fun isEmpty(): Boolean = head == null

    fun reversed() {
        var preNode: Node? = null
        var current: Node? = head
        var nextNode: Node?

        while (current != null) {
            nextNode = current.next
            current.next = preNode
            preNode = current

            current = nextNode
        }

        preNode?.let {
            head = it
        }
    }
}
