package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.LeadersInAnArray;

import java.util.ArrayList;

public class LeadersInAnArrayImpl implements LeadersInAnArray {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        int max = A.get(A.size() - 1);
        resultArray.add(max);
        for (int i = A.size() - 2; i >= 0; i--) {
            if (A.get(i) > max) {
                max = A.get(i);
                resultArray.add(max);
            }
        }
        return resultArray;
    }
}
