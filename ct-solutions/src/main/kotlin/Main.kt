import com.kimbh.ct_solutions.base.Hash_Problem_4

// [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
// [["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]
fun main() {
    val problem = Hash_Problem_4()
    val result1 = problem.solution(arrayOf(arrayOf("yellow_hat", "headgear"), arrayOf("blue_sunglasses", "eyewear"), arrayOf("green_turban", "headgear")))
    val result2 = problem.solution(arrayOf(arrayOf("crow_mask", "face"), arrayOf("blue_sunglasses", "face"), arrayOf("smoky_makeup", "face")))

    println("result1 : $result1")
    println("result2 : $result2")
}