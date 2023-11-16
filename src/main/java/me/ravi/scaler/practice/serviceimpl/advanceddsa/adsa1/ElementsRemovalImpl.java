package me.ravi.scaler.practice.serviceimpl.advanceddsa.adsa1;

import me.ravi.scaler.practice.service.intermediatedsa.ElementsRemoval;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemovalImpl implements ElementsRemoval {
    /**
     * @param A
     * @return
     */
    @Override
    public int solve(ArrayList<Integer> A) {
        int sizeOfArrayList = A.size();
        int finalCost = 0;
        Collections.sort(A);
        for (int i = 0; i < sizeOfArrayList; i++) {
            finalCost = finalCost + A.get(i) * (sizeOfArrayList - i);
        }
        return finalCost;
    }
}
