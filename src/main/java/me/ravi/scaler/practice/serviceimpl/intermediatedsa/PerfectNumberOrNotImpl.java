package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.PerfectNumberOrNot;
import org.springframework.stereotype.Service;

@Service
public class PerfectNumberOrNotImpl implements PerfectNumberOrNot {
    @Override
    public int solve(int A) {
        int isPerfect = 0;
        int sum = 0;

        if (A == 1) {
            return isPerfect;
        }
        for (int i = 1; i * i <= A; i++) {
            System.out.println("i=" + i + ",sum=" + sum);
            if (sum > A) {
                return isPerfect;
            }
            if (A % i == 0) {
                if (i == 1 || i * i == A) {
                    sum += i;
                } else if (i != A / i) {
                    sum += i;
                    sum += A / i;
                }
            }
        }
        if (sum == A) {
            isPerfect = 1;
        }
        return isPerfect;
    }
}
