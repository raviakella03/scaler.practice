package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ArrayRightRotation;

import java.util.ArrayList;

public class ArrayRightRotationImpl implements ArrayRightRotation {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        B = B % A.size();
        reverseArray(A, 0, A.size() - 1);
        reverseArray(A, 0, B - 1);
        reverseArray(A, B, A.size() - 1);
        return A;
    }

    private void reverseArray(ArrayList<Integer> A, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            A.set(leftIndex, A.get(leftIndex) + A.get(rightIndex));
            A.set(rightIndex, A.get(leftIndex) - A.get(rightIndex));
            A.set(leftIndex, A.get(leftIndex) - A.get(rightIndex));
            ++leftIndex;
            --rightIndex;
        }
    }


}
