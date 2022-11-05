package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.SecondLargest;

import java.util.ArrayList;

public class SecondLargestImpl implements SecondLargest {
    @Override
    public int solve(ArrayList<Integer> A) {
        int secondMax = Integer.MIN_VALUE;
        int max = A.get(0);
        if (A.size() == 1) {
            return -1;
        }
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < max && A.get(i) > secondMax) {
                secondMax = A.get(i);
            }
        }
        return secondMax;
    }
}
