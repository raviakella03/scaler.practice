package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.EvenSubArrays;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EvenSubArraysImpl implements EvenSubArrays {
    @Override
    public String solve(ArrayList<Integer> A) {
        String outputString = "NO";
        if (A.size() % 2 == 0 && A.get(0) % 2 == 0 && A.get(A.size() - 1) % 2 == 0) {
            outputString = "YES";
        }
        return outputString;
    }
}
