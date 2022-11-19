package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.CountingSubarrays;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountingSubarraysImpl implements CountingSubarrays {
    /**
     * @param A Integer array
     * @param B Maximum Sub-Array sum
     * @return Count of Sub-Arrays that satisfy the condition
     * @Time_Complexity O(N * N)
     * @Space_Complexity O(N)
     */
    @Override
    public int solve(ArrayList<Integer> A, int B) {
        int subArraysCount = 0;
        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            for (int j = i; j < A.size(); j++) {
                sum += A.get(j);
                if (sum < B) {
                    ++subArraysCount;
                }
            }
        }
        return subArraysCount;
    }
}
