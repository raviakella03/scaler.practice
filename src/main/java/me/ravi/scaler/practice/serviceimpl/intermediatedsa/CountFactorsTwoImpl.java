package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.CountFactorsTwo;
import org.springframework.stereotype.Service;

@Service
public class CountFactorsTwoImpl implements CountFactorsTwo {
    @Override
    public int solve(int A) {
        int factorsCount = 0;
        if (A == 1) {
            return 1;
        }

        if (isPrime(A)) {
            return 2;
        }
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                if (i != A / i) {
                    factorsCount += 2;
                } else {
                    ++factorsCount;
                }
            }
        }
        return factorsCount;
    }

    private boolean isPrime(int A) {
        if (A <= 1) {
            return false;
        }
        if (A == 2) {
            return true;
        }
        if (A % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(A); i = i + 2) {
            if (A % i == 0) {
                return false;
            }
        }
        return true;
    }
}
