package baseball.model

import camp.nextstep.edu.missionutils.Randoms

class Computer {
    val numbers = mutableListOf<Int>()

    init {
        pickNumbers()
    }

    fun pickNumbers() {
        while (numbers.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!numbers.contains(randomNumber)) {
                numbers.add((randomNumber))
            }
        }
    }
}