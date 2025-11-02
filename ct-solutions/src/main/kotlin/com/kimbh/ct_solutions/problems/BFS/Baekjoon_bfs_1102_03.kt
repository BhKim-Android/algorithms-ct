package com.kimbh.ct_solutions.problems.BFS

/**
 * https://www.acmicpc.net/problem/1926
 **/
class Baekjoon_bfs_1102_03 {
    fun solution(maps: Array<IntArray>): Int {
        val n = maps.size
        val m = maps[0].size

        var queue = ArrayDeque<Pair<Int, Int>>()
        //
        var dist = Array(n) { IntArray(m) { -1 } }

        queue.addLast(Pair(0, 0))
        dist[0][0] = 1

        val rx = arrayOf(-1, 1, 0, 0)
        val ry = arrayOf(0, 0, -1, 1)

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            for (i in rx.indices) {
                val moveX = current.first + rx[i]
                val moveY = current.second + ry[i]

                if (moveX in 0 until n && moveY in 0 until m && maps[moveX][moveY] == 1 && dist[moveX][moveY] == -1) {
                    queue.addLast(Pair(moveX, moveY))
                    dist[moveX][moveY] = dist[current.first][current.second] + 1
                }
            }
        }

        return dist[n - 1][m - 1]
    }
}