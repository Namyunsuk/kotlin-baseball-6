package baseball.Utils

class UserInputException {
    companion object {
        fun checkUserNums(userInput: String): List<Int> {
            require(isNumber(userInput)) { "숫자가 아닌 값은 입력할 수 없습니다.\n" }
            val userNumbers = userInput.map { it.toString().toInt() }
            require(isDuplicate(userNumbers)) { "중복된 값이 존재합니다.\n" }
            require(inRange(userNumbers)) { "숫자는 1~9 사이어야 합니다.\n" }
            require(userNumbers.size == 3) { "숫자는 세자리여야 합니다.\n" }
            return userNumbers
        }

        fun checkGameProgressNum(userInput: String): Int {
            require(isNumber(userInput)) { "숫자가 아닌 값은 입력할 수 없습니다.\n" }
            val number = userInput.toInt()
            require(number == 1 || number == 2) { "1 또는 2를 입력해 주세요.\n" }
            return number
        }

        fun isNumber(userInput: String): Boolean {
            for (numberIndex in userInput.indices) {
                if (userInput[numberIndex].code < '0'.code || userInput[numberIndex].code > '9'.code) {
                    return false
                }
            }
            return true
        }

        fun isDuplicate(userNumbers: List<Int>): Boolean {
            val distinctUserNumbers = userNumbers.distinct()
            return userNumbers.size == distinctUserNumbers.size
        }

        fun inRange(userNumbers: List<Int>): Boolean {
            return userNumbers.all { it in 1..9 }
        }
    }
}