package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.CountIncreasingTriplets;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountIncreasingTripletsImpl implements CountIncreasingTriplets {
    /**
     * @param A
     * @return
     */
    @Override
    public int solve(ArrayList<Integer> A) {
        int countOfPossibleValidTriplets = 0;
        int inputArraySize = A.size();
        for (int i = 0; i < inputArraySize; i++) {
            int countOfSmallerNumbersOnLeft = 0;
            int countOfBiggerNumbersOnRight = 0;
            for (int j = 0; j < i; j++) {
                if (A.get(j) < A.get(i))
                    ++countOfSmallerNumbersOnLeft;
            }

            for (int j = i + 1; j < inputArraySize; j++) {
                if (A.get(i) < A.get(j))
                    ++countOfBiggerNumbersOnRight;
            }
            countOfPossibleValidTriplets += countOfSmallerNumbersOnLeft * countOfBiggerNumbersOnRight;
        }
        return countOfPossibleValidTriplets;
    }
}
