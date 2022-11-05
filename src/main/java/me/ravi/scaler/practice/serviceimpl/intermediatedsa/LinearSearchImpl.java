package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.LinearSearch;

import java.util.ArrayList;

public class LinearSearchImpl implements LinearSearch {
    @Override
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        int leftIndex = 0;
        int rightIndex = A.size() - 1;
        while (leftIndex <= rightIndex) {
            if (leftIndex == rightIndex) {
                if (A.get(leftIndex) == B) {
                    ++count;
                }
            } else {
                if (A.get(leftIndex) == B) {
                    ++count;
                }
                if (A.get(rightIndex) == B) {
                    ++count;
                }
            }
            ++leftIndex;
            --rightIndex;
        }
        return count;
    }
}
