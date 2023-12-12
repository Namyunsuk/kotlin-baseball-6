package baseball.view

import baseball.Utils.UserInputException
import baseball.model.User
import camp.nextstep.edu.missionutils.Console

class InputView {
    companion object {
        fun readNumber(): List<Int> {
            print("숫자를 입력해주세요 : ")
            while (true) {
                val userInput = Console.readLine()
                try {
                    return UserInputException.checkUserNums(userInput)
                } catch (e: IllegalArgumentException) {
                    print(e.message)
                }
            }

        }

        fun readGameProgress(): Int {
            println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
            while(true){
                val userInput = Console.readLine()
                try {
                    return UserInputException.checkGameProgressNum(userInput)
                }catch (e: IllegalArgumentException){
                    print(e.message)
                }
            }
        }
    }
}