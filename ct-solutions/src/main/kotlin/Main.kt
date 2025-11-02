import com.kimbh.ct_solutions.problems.BFS.Baekjoon_bfs_1102_03
import com.kimbh.ct_solutions.problems.BFS.Programmers_bfs_1101_01

//  maps	        answer
//  [1,0,1,1,1]     11
//  [1,0,1,0,1]
//  [1,0,1,1,1]
//  [1,1,1,0,1]
//  [0,0,0,0,1]

//  [1,0,1,1,1]     -1
//  [1,0,1,0,1]
//  [1,0,1,1,1]
//  [1,1,1,0,0]
//  [0,0,0,0,1]
fun main() {
    val problem = Baekjoon_bfs_1102_03()
    val answer = problem.solution(
        arrayOf(
            intArrayOf(1, 0, 1, 1, 1),
            intArrayOf(1, 0, 1, 0, 1),
            intArrayOf(1, 0, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 1)
        )
    )
    println("answer : $answer")
}