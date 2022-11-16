package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.SubarrayInAGivenRange;

import java.util.ArrayList;

public class SubarrayInAGivenRangeImpl implements SubarrayInAGivenRange {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> subArray = new ArrayList<>();
        for (int i = B; i <= C; i++) {
            subArray.add(A.get(i));
        }
        return subArray;
    }
}
