package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.CountOfEvenNumbersInARange;

import java.util.ArrayList;

public class CountOfEvenNumbersInARangeImpl implements CountOfEvenNumbersInARange {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> evenNumberCountList = new ArrayList<>();
        ArrayList<Integer> evenNumList = new ArrayList<>();
        int leftIndex;
        int rightIndex;
        createEvenNumList(A, evenNumList);
        for (int i = 0; i < B.size(); i++) {
            leftIndex = B.get(i).get(0);
            rightIndex = B.get(i).get(1);
            if (leftIndex == 0) {
                evenNumberCountList.add(evenNumList.get(rightIndex));
            } else {
                evenNumberCountList.add(evenNumList.get(rightIndex) - evenNumList.get(leftIndex - 1));
            }
        }
        return evenNumberCountList;
    }

    private void createEvenNumList(ArrayList<Integer> A, ArrayList<Integer> evenNumList) {
        if (A.get(0) % 2 == 0) {
            evenNumList.add(1);
        } else {
            evenNumList.add(0);
        }
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                evenNumList.add(evenNumList.get(i - 1) + 1);
            } else {
                evenNumList.add(evenNumList.get(i - 1));
            }
        }
    }
}
