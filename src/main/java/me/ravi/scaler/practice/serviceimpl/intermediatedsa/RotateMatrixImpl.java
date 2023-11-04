package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import lombok.extern.slf4j.Slf4j;
import me.ravi.scaler.practice.service.intermediatedsa.RotateMatrix;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class RotateMatrixImpl implements RotateMatrix {
    @Override
    public void solve(ArrayList<ArrayList<Integer>> A) {
        log.info("Array A: {}", A);
        transpose(A);
        log.info("After Transpose - A: {}", A);
        reverse(A);
        log.info("After Reverse - A: {}", A);
    }

    private void transpose(ArrayList<ArrayList<Integer>> A) {
        int matrixSize = A.size();
        ArrayList<ArrayList<Integer>> transposeMatrix = new ArrayList<>();
        for (int i = 0; i < matrixSize; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrixSize; j++) {
                row.add(A.get(j).get(i));
            }
            transposeMatrix.add(row);
        }
        A.clear();
        A.addAll(transposeMatrix);
        log.info("After Transpose - transposeMatrix: {}", A);
    }

    private void reverse(ArrayList<ArrayList<Integer>> A) {
        int matrixSize = A.size();
        for (int i = 0; i < matrixSize; i++) {
            int startIndex = 0;
            int endIndex = matrixSize - 1;
            while (startIndex < endIndex) {
                A.get(i).set(startIndex, A.get(i).get(startIndex) + A.get(i).get(endIndex));
                A.get(i).set(endIndex, A.get(i).get(startIndex) - A.get(i).get(endIndex));
                A.get(i).set(startIndex, A.get(i).get(startIndex) - A.get(i).get(endIndex));
                ++startIndex;
                --endIndex;
            }
        }
    }

    public void solve2(ArrayList<ArrayList<Integer>> A) {
        int matrixSize = A.size();
        log.info("Array A: {}", A);
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j <= i - 1; j++) {
                A.get(i).set(j, A.get(i).get(j) + A.get(j).get(i));
                A.get(j).set(i, A.get(i).get(j) - A.get(j).get(i));
                A.get(i).set(j, A.get(i).get(j) - A.get(j).get(i));
            }
        }
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j <= matrixSize / 2 - 1; j++) {
                A.get(i).set(j, A.get(i).get(j) + A.get(i).get(matrixSize - j - 1));
                A.get(i).set(matrixSize - j - 1, A.get(i).get(j) - A.get(i).get(matrixSize - j - 1));
                A.get(i).set(j, A.get(i).get(j) - A.get(i).get(matrixSize - j - 1));
            }
        }
        log.info("After Rotate - A: {}", A);
    }
}
