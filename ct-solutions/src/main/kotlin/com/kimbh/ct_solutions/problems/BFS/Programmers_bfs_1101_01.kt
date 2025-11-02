package com.kimbh.ct_solutions.problems.BFS

/**
 * 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=java
 **/
class Programmers_bfs_1101_01 {
    fun solution(maps: Array<IntArray>): Int {
        var move = 1
        val queue = ArrayDeque<Pair<Int, Int>>()
        val visit = Array(size = maps.size) { BooleanArray(size = maps[0].size) { false } }

        val x = maps.size - 1
        val y = maps[0].size - 1
        // 상대팀 진영..
        val goal = Pair(x, y)

        // 시작..
        queue.addLast(Pair(0, 0))
        visit[0][0] = true

        while (queue.isNotEmpty()) {
            val size = queue.size
            move++
            for (i in 0 until size) {
                val current = queue.removeFirst()
                val up = Pair(current.first, current.second - 1)
                val down = Pair(current.first, current.second + 1)
                val left = Pair(current.first - 1, current.second)
                val right = Pair(current.first + 1, current.second)

                // 길이 있는지 확인 && 왔던 길인지 확인
                // 길 방문 표시.
                if (up.second >= 0 && !visit[up.first][up.second] && maps[up.first][up.second] == 1) {
                    if (up == goal) return move
                    queue.addLast(up)
                    visit[up.first][up.second] = true
                }
                if (down.second <= y && !visit[down.first][down.second] && maps[down.first][down.second] == 1) {
                    if (down == goal) return move
                    queue.addLast(down)
                    visit[down.first][down.second] = true
                }
                if (left.first >= 0 && !visit[left.first][left.second] && maps[left.first][left.second] == 1) {
                    if (left == goal) return move
                    queue.addLast(left)
                    visit[left.first][left.second] = true
                }
                if (right.first <= y && !visit[right.first][right.second] && maps[right.first][right.second] == 1) {
                    if (right == goal) return move
                    queue.addLast(right)
                    visit[right.first][right.second] = true
                }
            }
        }

        return -1
    }
}