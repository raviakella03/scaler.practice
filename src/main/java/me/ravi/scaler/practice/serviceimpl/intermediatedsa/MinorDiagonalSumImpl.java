package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.MinorDiagonalSum;

import java.util.ArrayList;
import java.util.List;

public class MinorDiagonalSumImpl implements MinorDiagonalSum {
    @Override
    public int solve(List<ArrayList<Integer>> A) {
        int minorDiagonalSum = 0;
        int arraySize = A.size();
        for (int i = arraySize - 1; i >= 0; i--) {
            minorDiagonalSum += A.get(arraySize - i - 1).get(i);
        }
        return minorDiagonalSum;
    }
}
