package com.kimbh.ct_solutions.common

class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    private var head: Node? = null

    fun insert(preNode: Node, data: Int) {
        val newNode = Node(data)
        newNode.next = preNode.next
        preNode.next = newNode
    }

    fun delete(data: Int) {
        var current = head
        while (current?.next != null) {
            if (current.data == data) {
                current.next = null
            } else {
                current = current.next
            }
        }
    }
}