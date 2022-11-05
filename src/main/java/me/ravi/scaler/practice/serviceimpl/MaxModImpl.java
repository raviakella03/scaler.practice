package me.ravi.scaler.practice.serviceimpl;

import me.ravi.scaler.practice.service.MaxMod;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MaxModImpl implements MaxMod {
    private int maxMod = 0;

    @Override
    public int solve(ArrayList<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                if (i != j && A.get(j) != 0) {
                    maxMod = Math.max(A.get(i) % A.get(j), maxMod);
                }
            }
        }
        return maxMod;
    }
}
