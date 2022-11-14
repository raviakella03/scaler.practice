package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.PickFromBothSides;

import java.util.ArrayList;

public class PickFromBothSidesImpl implements PickFromBothSides {
    @Override
    public int solve(ArrayList<Integer> A, int B) {
        int maxSum = Integer.MIN_VALUE;
        int arraySize = A.size();
        for (int i = 0; i <= B; i++) {
            int sum = 0;
            int N_l = B - i;
            for (int j = 0; j < N_l; j++) {
                sum += A.get(j);
            }
            if (i > 0) {
                for (int j = arraySize - 1; j >= arraySize - i; j--) {
                    sum += A.get(j);
                }
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
