
using System;

public class Solution
{
    private static readonly int IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER = -1;

    public int MinChanges(int sourceNumber, int targetNumber)
    {
        int minChangesToMakeSourceNumberEqualToTargetNumber = 0;

        while (sourceNumber > 0 || targetNumber > 0)
        {
            int sourceDigit = sourceNumber & 1;
            int targetDigit = targetNumber & 1;

            if (sourceDigit < targetDigit)
            {
                return IMPOSSIBLE_TO_MAKE_SOURCE_NUMBER_EQUAL_TO_TARGET_NUMBER;
            }

            minChangesToMakeSourceNumberEqualToTargetNumber += sourceDigit ^ targetDigit;
            sourceNumber >>= 1;
            targetNumber >>= 1;
        }

        return minChangesToMakeSourceNumberEqualToTargetNumber;

    }
}
