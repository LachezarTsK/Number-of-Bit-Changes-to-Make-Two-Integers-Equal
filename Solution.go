
package main

import "fmt"

const IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER = -1

func minChanges(sourceNumber int, targetNumber int) int {
    minChangesToMakeSourceNumberEqualToTargetNumber := 0

    for sourceNumber > 0 || targetNumber > 0 {
        sourceDigit := sourceNumber & 1
        targetDigit := targetNumber & 1

        if sourceDigit < targetDigit {
            return IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER
        }

        minChangesToMakeSourceNumberEqualToTargetNumber += sourceDigit ^ targetDigit
        sourceNumber >>= 1
        targetNumber >>= 1
    }

    return minChangesToMakeSourceNumberEqualToTargetNumber
}
