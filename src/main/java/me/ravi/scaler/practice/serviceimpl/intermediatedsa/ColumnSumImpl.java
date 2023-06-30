package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ColumnSum;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ColumnSumImpl implements ColumnSum {
    @Override
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> columnSumList = new ArrayList<>();
        int rowSize = A.size();
        int columnSize = A.get(0).size();
        for (int i = 0; i < columnSize; i++) {
            int columnSum = 0;
            for (int j = 0; j < rowSize; j++) {
                columnSum += A.get(j).get(i);
            }
            columnSumList.add(columnSum);
        }
        return columnSumList;
    }

    @Override
    public int[] solve(int[][] A) {
        int rowSize = A.length;
        int columnSize = A[0].length;
        int[] columnSumList = new int[columnSize];
        for (int i = 0; i < columnSize; i++) {
            int columnSum = 0;
            for (int j = 0; j < rowSize; j++) {
                columnSum += A[j][i];
            }
            columnSumList[i] = columnSum;
        }
        return columnSumList;
    }
}
