package com.kimbh.ct_solutions.problems.BFS

/**
 * https://www.acmicpc.net/problem/1926
 **/
class Baekjoon_bfs_1102_02 {
    fun solution(paint: Array<IntArray>): IntArray {
        val n = paint.size
        val m = paint[0].size

        val visit = Array(n) { BooleanArray(m) { false } }
        var queue = ArrayDeque<Pair<Int, Int>>()
        var maxPage = 0
        var count = 0

        val rx = arrayOf(-1, 1, 0, 0)
        val ry = arrayOf(0, 0, -1, 1)

        for (x in 0 until n) {
            for (y in 0 until m) {
                if (paint[x][y] == 1 && !visit[x][y]) {
                    queue.addLast(Pair(x, y))
                    visit[x][y] = true
                    var page = 0

                    count++

                    while (queue.isNotEmpty()) {
                        val current = queue.removeLast()
                        page++

                        for (i in rx.indices) {
                            val moveX = current.first + rx[i]
                            val moveY = current.second + ry[i]

                            if (moveX in 0 until n && moveY in 0 until m && paint[moveX][moveY] == 1 && !visit[moveX][moveY]) {
                                queue.addLast(Pair(moveX, moveY))
                                visit[moveX][moveY] = true
                            }
                        }

                        if (maxPage < page) maxPage = page
                    }
                }
            }
        }

        return intArrayOf(count, maxPage)
    }
}