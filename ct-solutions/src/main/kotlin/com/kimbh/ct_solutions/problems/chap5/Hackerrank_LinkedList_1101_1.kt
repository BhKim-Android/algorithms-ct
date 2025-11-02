fun main() {

}

class Cusor(var data: Char) {
    var preCusor: Cusor? = null
    var nextCusor: Cusor? = null
}

class Editor {
    var current: Cusor = Cusor(' ')

//    커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
    fun funL() {

    }

//    커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
    fun funD() {

    }

//    커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
//    삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
    fun funB() {

    }

//    $라는 문자를 커서 왼쪽에 추가함
    fun funP(input: Char) {

    }
}