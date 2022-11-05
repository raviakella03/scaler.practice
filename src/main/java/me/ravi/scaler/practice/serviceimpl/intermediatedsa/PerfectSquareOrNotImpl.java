package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.PerfectSquareOrNot;
import org.springframework.stereotype.Service;

@Service
public class PerfectSquareOrNotImpl implements PerfectSquareOrNot {
    @Override
    public int solve(int A) {
        int i = (int) Math.sqrt(A);
        if (i * i == A) {
            return (int) Math.sqrt(A);
        }
        return -1;
    }
}
