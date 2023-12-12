package baseball

import baseball.controller.GameController
import baseball.view.OutputView

fun main() {
    val gameController = GameController()
    OutputView.printGameStartComment()
    gameController.start()
}
