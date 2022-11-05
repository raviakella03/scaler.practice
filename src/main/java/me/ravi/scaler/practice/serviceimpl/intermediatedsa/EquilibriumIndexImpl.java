package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.EquilibriumIndex;

import java.util.ArrayList;

public class EquilibriumIndexImpl implements EquilibriumIndex {
    @Override
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> prefixSumList = new ArrayList<>();
        createPrefixSumList(A, prefixSumList);
        for (int i = 0; i < A.size(); i++) {
            if (i == 0) {
                if (0 == prefixSumList.get(A.size() - 1) - prefixSumList.get(0)) {
                    return i;
                }
            } else {
                if (prefixSumList.get(i - 1) == prefixSumList.get(A.size() - 1) - prefixSumList.get(i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void createPrefixSumList(ArrayList<Integer> A, ArrayList<Integer> prefixSumList) {
        prefixSumList.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            prefixSumList.add(prefixSumList.get(i - 1) + A.get(i));
        }
    }
}
