package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.SpecialIndex;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpecialIndexImpl implements SpecialIndex {
    /**
     * @param A
     * @return
     */
    @Override
    public int solve(ArrayList<Integer> A) {
        int arraySize = A.size();
        int returnCount = 0;
        List<Integer> evenIndexPrefixSum = new ArrayList<>();
        List<Integer> oddIndexPrefixSum = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            if (i == 0) {
                evenIndexPrefixSum.add(0, A.get(0));
                oddIndexPrefixSum.add(0, 0);
                continue;
            }

            if (i % 2 == 0) {
                evenIndexPrefixSum.add(i, evenIndexPrefixSum.get(i - 1) + A.get(i));
                oddIndexPrefixSum.add(i, oddIndexPrefixSum.get(i - 1));
            } else {
                oddIndexPrefixSum.add(i, oddIndexPrefixSum.get(i - 1) + A.get(i));
                evenIndexPrefixSum.add(i, evenIndexPrefixSum.get(i - 1));
            }
        }

        for (int i = 0; i < arraySize; i++) {
            int evenSum = oddIndexPrefixSum.get(arraySize - 1) - oddIndexPrefixSum.get(i);
            int oddSum = evenIndexPrefixSum.get(arraySize - 1) - evenIndexPrefixSum.get(i);
            if (i != 0) {
                evenSum += evenIndexPrefixSum.get(i - 1);
                oddSum += oddIndexPrefixSum.get(i - 1);
            }
            if (evenSum == oddSum) {
                ++returnCount;
            }
        }
        return returnCount;
    }

    /*public int solve(ArrayList<Integer> A) {
        int arraySize = A.size();
        if (arraySize == 1) {
            return 1;
        } else if (arraySize == 2) {
            return 0;
        }
        int returnCount = 0;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arraySize; i++) {
            if (i % 2 == 0) {
                evenSum += A.get(i);
            } else {
                oddSum += A.get(i);
            }
        }
        int currentOddSum = 0;
        int currentEvenSum = A.get(0);
        int newOddSum = 0;
        int newEvenSum = 0;
        for (int i = 1; i < arraySize - 1; i++) {
            if (i % 2 == 0) {
                currentEvenSum += A.get(i);
                newOddSum = currentOddSum + evenSum - currentEvenSum;
                newEvenSum = currentEvenSum + oddSum - currentOddSum - A.get(i);
            } else {
                currentOddSum += A.get(i);
                newEvenSum = currentEvenSum + oddSum - currentOddSum;
                newOddSum = currentOddSum + evenSum - currentEvenSum - A.get(i);
            }

            if (newEvenSum == newOddSum) {
                ++returnCount;
            }
        }
        if (oddSum == evenSum - A.get(0)) {
            ++returnCount;
        }

        if ((arraySize % 2 == 0 && oddSum == evenSum - A.get(arraySize - 1)) || (arraySize % 2 == 1 && evenSum == oddSum - A.get(arraySize - 1))) {
            ++returnCount;
        }
        return returnCount;
    }*/
}
