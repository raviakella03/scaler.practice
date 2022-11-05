package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.RangeSumQuery;

import java.util.ArrayList;

public class RangeSumQueryImpl implements RangeSumQuery {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> sumList = new ArrayList<>();
        int leftIndex;
        int rightIndex;
        for (int i = 0; i < B.size(); i++) {
            leftIndex = B.get(i).get(0) - 1;
            rightIndex = B.get(i).get(1) - 1;
            sumList.add(sumArrayRange(A, leftIndex, rightIndex));
        }
        return sumList;
    }

    @Override
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> sumList = new ArrayList<>();
        ArrayList<Long> prefixSumList = new ArrayList<>();
        createPrefixSumList(A, prefixSumList);
        for (int i = 0; i < B.size(); i++) {
            int leftIndex = B.get(i).get(0) - 1;
            int rightIndex = B.get(i).get(1) - 1;
            if (leftIndex == 0) {
                sumList.add(prefixSumList.get(rightIndex));
            } else {
                sumList.add(prefixSumList.get(rightIndex) - prefixSumList.get(leftIndex - 1));
            }
        }
        return sumList;
    }

    private void createPrefixSumList(ArrayList<Integer> A, ArrayList<Long> prefixSumList) {
        prefixSumList.add(Long.valueOf(A.get(0)));
        for (int i = 1; i < A.size(); i++) {
            prefixSumList.add(prefixSumList.get(i - 1) + A.get(i));
        }
    }

    private int sumArrayRange(ArrayList<Integer> A, int leftIndex, int rightIndex) {
        int sum = 0;
        for (int i = leftIndex; i <= rightIndex; i++) {
            sum += A.get(i);
        }
        return sum;
    }
}
