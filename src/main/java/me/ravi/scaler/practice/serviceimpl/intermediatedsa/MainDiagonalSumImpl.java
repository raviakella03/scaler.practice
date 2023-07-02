package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import lombok.extern.slf4j.Slf4j;
import me.ravi.scaler.practice.service.intermediatedsa.MainDiagonalSum;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MainDiagonalSumImpl implements MainDiagonalSum {
    @Override
    public int solve(List<ArrayList<Integer>> A) {
        int mainDiagonalSum = 0;
        for (int i = 0; i < A.size(); i++) {
            mainDiagonalSum += A.get(i).get(i);
        }
        return mainDiagonalSum;
    }
}
