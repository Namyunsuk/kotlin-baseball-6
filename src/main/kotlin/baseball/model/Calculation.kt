package baseball.model

class Calculation() {
    fun calculateResult(computerNums: List<Int>,userNums: List<Int>): Pair<Int, Int> {
        var strike = 0
        var ball = 0
        for (numIndex in computerNums.indices) {
            if (!isContain(numIndex,computerNums,userNums)) continue
            if (isStrike(numIndex,computerNums,userNums)) {
                strike += 1
                continue
            }
            ball += 1
        }
        return Pair(strike, ball)
    }

    private fun isStrike(numIndex: Int,computerNums: List<Int>,userNums: List<Int>): Boolean {
        return userNums[numIndex] == computerNums[numIndex]
    }

    private fun isContain(numIndex: Int,computerNums: List<Int>,userNums: List<Int>): Boolean {
        return userNums.contains(computerNums[numIndex])
    }
}