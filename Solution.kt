
class Solution {

    private companion object {
        const val IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER = -1
    }

    fun minChanges(sourceNumber: Int, targetNumber: Int): Int {
        var minChangesToMakeSourceNumberEqualToTargetNumber = 0
        var sourceNumber = sourceNumber
        var targetNumber = targetNumber

        while (sourceNumber > 0 || targetNumber > 0) {
            val sourceDigit = sourceNumber and 1
            val targetDigit = targetNumber and 1

            if (sourceDigit < targetDigit) {
                return IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER
            }

            minChangesToMakeSourceNumberEqualToTargetNumber += sourceDigit xor targetDigit
            sourceNumber = sourceNumber shr 1
            targetNumber = targetNumber shr 1
        }

        return minChangesToMakeSourceNumberEqualToTargetNumber
    }
}
