package baseball.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    companion object {
        fun readNumber(): List<Int> {
            val numbers = mutableListOf<Int>()
            print("숫자를 입력해주세요 : ")
            val userInput = Console.readLine().split("")
            userInput.forEach { numbers.add(it.toInt()) }
            return numbers
        }

        fun readGameProgress(): Int {
            println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
            return Console.readLine().toInt()
        }
    }
}