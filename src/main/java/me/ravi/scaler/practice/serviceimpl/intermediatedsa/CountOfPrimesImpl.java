package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.CountOfPrimes;
import org.springframework.stereotype.Service;

@Service
public class CountOfPrimesImpl implements CountOfPrimes {
    @Override
    public int solve(int A) {
        int countOfPrimes = 0;
        if (A == 1) {
            return countOfPrimes;
        }
        if (A == 2) {
            countOfPrimes = 1;
            return countOfPrimes;
        }
        for (int i = 2; i <= A; i++) {
            countOfPrimes = isPrime(i) ? countOfPrimes + 1 : countOfPrimes;
        }
        return countOfPrimes;
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
        for (int i = 3; i * i <= A; i = i + 2) {
            if (A % i == 0) {
                return false;
            }
        }
        return true;
    }
}
