package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ReverseArrayInRange;

import java.util.ArrayList;

public class ReverseArrayInRangeImpl implements ReverseArrayInRange {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        while (B < C) {
            A.set(B, A.get(B) + A.get(C));
            A.set(C, A.get(B) - A.get(C));
            A.set(B, A.get(B) - A.get(C));
            ++B;
            --C;
        }
        return A;
    }
}
