package baseball.controller

import baseball.model.Calculation
import baseball.model.Computer
import baseball.model.User
import baseball.view.InputView
import baseball.view.OutputView

class GameController {
    fun start() {
        val computer = Computer()
        val user = User()
        val calculation = Calculation()

        do {
            val userNumbers = user.pickNumbers()
            val computerNumbers = computer.numbers
            val (strike, ball) = calculation.calculateResult(computerNumbers, userNumbers)
            OutputView.printResult(strike, ball)
        } while (strike != GAME_OVER_STRIKE_COUNT)
        OutputView.printEndGame()
        restart()
    }

    fun restart() {
        val userChoice = InputView.readGameProgress()
        if (userChoice == RESTART) {
            start()
        }
    }

    companion object {
        const val RESTART = 1
        const val GAME_OVER_STRIKE_COUNT = 3
    }
}