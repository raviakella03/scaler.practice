package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.SumOfAllSubArrays;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SumOfAllSubArraysImpl implements SumOfAllSubArrays {
    @Override
    public Long subarraySum(ArrayList<Integer> A) {
        long subArraysSum = 0L;
        for (int i = 0; i < A.size(); i++) {
            subArraysSum += (long) (i + 1) * (A.size() - i) * A.get(i);
        }
        return subArraysSum;
    }
}
