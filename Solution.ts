
function minChanges(sourceNumber: number, targetNumber: number): number {
    const IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER = -1;
    let minChangesToMakeSourceNumberEqualToTargetNumber = 0;

    while (sourceNumber > 0 || targetNumber > 0) {
        const sourceDigit = sourceNumber & 1;
        const targetDigit = targetNumber & 1;

        if (sourceDigit < targetDigit) {
            return IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER;
        }

        minChangesToMakeSourceNumberEqualToTargetNumber += sourceDigit ^ targetDigit;
        sourceNumber >>= 1;
        targetNumber >>= 1;
    }

    return minChangesToMakeSourceNumberEqualToTargetNumber;
};
