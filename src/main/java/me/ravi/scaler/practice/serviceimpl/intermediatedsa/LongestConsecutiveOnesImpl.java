package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.LongestConsecutiveOnes;
import org.springframework.stereotype.Service;

@Service
public class LongestConsecutiveOnesImpl implements LongestConsecutiveOnes {
    /**
     * @param A
     * @return
     */
    @Override
    public int solve(String A) {
        int lengthOfConsecutiveOnes = 0;
        int inputStringLength = A.length();
        int totalNumberOfOnesInTheInputString = 0;
        for (int i = 0; i < inputStringLength; i++) {
            if (A.charAt(i) == '1') {
                ++totalNumberOfOnesInTheInputString;
            }
        }
        if (totalNumberOfOnesInTheInputString == 0
                || totalNumberOfOnesInTheInputString == 1
                || totalNumberOfOnesInTheInputString == 2
                || totalNumberOfOnesInTheInputString == inputStringLength - 1
                || totalNumberOfOnesInTheInputString == inputStringLength) {
            return totalNumberOfOnesInTheInputString;
        } else {
            int onesOnLeft = -1;
            int onesOnRight = 0;
            int previousZeroIndex = 0;
            int currentZeroIndex;
            int nextZeroIndex = -1;
            for (int i = 0; i < inputStringLength; ) {
                int currentLengthOfOnes = 0;
                if (A.charAt(i) == '0') {
                    currentZeroIndex = i;
                    if (onesOnLeft == -1) {
                        onesOnLeft = currentZeroIndex - previousZeroIndex;
                    } else {
                        onesOnLeft = onesOnRight;
                    }
                    onesOnRight = 0;
                    for (int j = i + 1; j < inputStringLength; j++) {
                        if (A.charAt(j) == '1') {
                            ++onesOnRight;
                        } else if (A.charAt(j) == '0') {
                            nextZeroIndex = j;
                            break;
                        }
                    }
                    if (onesOnLeft + onesOnRight < totalNumberOfOnesInTheInputString) {
                        currentLengthOfOnes = onesOnLeft + onesOnRight + 1;
                    } else {
                        currentLengthOfOnes = onesOnLeft + onesOnRight;
                    }
                    previousZeroIndex = currentZeroIndex;
                    if (i >= nextZeroIndex) {
                        ++i;
                    } else {
                        i = nextZeroIndex;
                    }
                } else {
                    ++i;
                }
                lengthOfConsecutiveOnes = Math.max(lengthOfConsecutiveOnes, currentLengthOfOnes);
            }
        }
        return lengthOfConsecutiveOnes;
    }
}
