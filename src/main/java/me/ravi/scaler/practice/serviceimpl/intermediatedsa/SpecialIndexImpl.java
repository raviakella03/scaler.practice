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
}
