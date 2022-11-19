package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.GoodSubarrays;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GoodSubarraysImpl implements GoodSubarrays {
    @Override
    public int solve(ArrayList<Integer> A, int B) {
        int goodSubArraysCount = 0;
        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            for (int j = i; j < A.size(); j++) {
                sum += A.get(j);
                if ((sum < B && ((j - i + 1) % 2 == 0)) || (sum > B && ((j - i + 1) % 2 != 0)))
                    ++goodSubArraysCount;
            }
        }
        return goodSubArraysCount;
    }
}
