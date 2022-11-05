package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.PrimeOrNot;
import org.springframework.stereotype.Service;

@Service
public class PrimeOrNotImpl implements PrimeOrNot {
    @Override
    public int solve(Long A) {
        if (A <= 1) {
            return 0;
        }
        if (A == 2) {
            return 1;
        }
        if (A % 2 == 0) {
            return 0;
        }
        for (int i = 3; i <= Math.sqrt(A); i = i + 2) {
            if (A % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
