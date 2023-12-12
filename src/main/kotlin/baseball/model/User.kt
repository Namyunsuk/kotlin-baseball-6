package baseball.model

import baseball.view.InputView

class User {
    fun pickNumbers():List<Int>{
        return InputView.readNumber()
    }
}