package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.MatrixTranspose;

import java.util.ArrayList;

public class MatrixTransposeImpl implements MatrixTranspose {
    @Override
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int noOfRows = A.size();
        int noOfColumns = A.get(0).size();
        ArrayList<ArrayList<Integer>> transposeMatrix = new ArrayList<>();
        for (int i = 0; i < noOfColumns; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < noOfRows; j++) {
                row.add(A.get(j).get(i));
            }
            transposeMatrix.add(row);
        }
        return transposeMatrix;
    }

    @Override
    public int[][] solve(int[][] A) {
        int noOfRows = A.length;
        int noColumns = A[0].length;
        int[][] transposeMatrix = new int[noColumns][noOfRows];
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noColumns; j++) {
                transposeMatrix[j][i] = A[i][j];
            }
        }
        return transposeMatrix;
    }
}
