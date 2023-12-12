package baseball.view

class OutputView {
    companion object {
        fun printGameStartComment() {
            println("숫자 야구 게임을 시작합니다.")
        }

        fun printResult(strike: Int, ball: Int) {
            if (strike == 0 && ball == 0) {
                println("낫싱")
                return
            }
            if (strike != 0 && ball == 0) {
                println("${strike}스트라이크")
                return
            }
            if (strike == 0 && ball != 0) {
                println("${ball}볼")
                return
            }
            if (strike != 0 && ball != 0) {
                println("${ball}볼 ${strike}스트라이크")
            }
        }
        fun printEndGame(){
            println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        }
    }
}