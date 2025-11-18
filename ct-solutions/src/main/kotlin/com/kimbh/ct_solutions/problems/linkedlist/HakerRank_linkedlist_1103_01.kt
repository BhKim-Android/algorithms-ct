package com.kimbh.ct_solutions.problems.linkedlist

import java.io.*
import java.util.*

/**
 * https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 **/

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */


}

class SinglyLinkedListNode() {
    var next: SinglyLinkedListNode? = null
}

fun has_cycle(head: SinglyLinkedListNode): Int {
    var slow: SinglyLinkedListNode? = head.next
    var fast: SinglyLinkedListNode? = head.next?.next

    while (slow != fast) {
        if (slow?.next == null || fast?.next?.next == null) {
            return 0
        }
        slow = slow.next
        fast = fast.next?.next
    }
    return 1
}