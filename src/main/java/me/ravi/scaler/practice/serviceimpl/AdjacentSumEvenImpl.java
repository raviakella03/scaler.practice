package me.ravi.scaler.practice.serviceimpl;

import me.ravi.scaler.practice.service.AdjacentSumEven;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdjacentSumEvenImpl implements AdjacentSumEven {

    @Override
    public int solve(ArrayList<Integer> A) {
        int oddNumbers = 0;
        int evenNumbers = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                ++evenNumbers;
            } else {
                ++oddNumbers;
            }
        }
        return Math.min(evenNumbers, oddNumbers);
    }

    public int solveIt(ArrayList<Integer> A) {
        int N = A.size();
        int max = A.get(0);
        int maxCount = 1;
        for (int i = 1; i < N; i++) {
            if (A.get(i) == max) {
                ++maxCount;
            } else if (A.get(i) > max) {
                max = A.get(i);
                maxCount = 1;
            }
        }
        return N - maxCount;
    }
}
