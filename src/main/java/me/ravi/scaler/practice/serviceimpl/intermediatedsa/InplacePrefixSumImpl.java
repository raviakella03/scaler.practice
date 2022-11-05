package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.InplacePrefixSum;

import java.util.ArrayList;

public class InplacePrefixSumImpl implements InplacePrefixSum {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        for (int i = 1; i < A.size(); i++) {
            A.set(i, A.get(i) + A.get(i - 1));
        }
        return A;
    }
}
