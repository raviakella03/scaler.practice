package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ReverseArray;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayImpl implements ReverseArray {
    @Override
    public ArrayList<Integer> solve(List<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        int N = A.size();
        for (int i = N - 1; i >= 0; i--) {
            B.add(A.get(i));
        }
        return B;
    }
}
