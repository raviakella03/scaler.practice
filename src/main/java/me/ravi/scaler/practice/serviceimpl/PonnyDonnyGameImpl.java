package me.ravi.scaler.practice.serviceimpl;

import me.ravi.scaler.practice.service.PonnyDonnyGame;
import org.springframework.stereotype.Service;

@Service
public class PonnyDonnyGameImpl implements PonnyDonnyGame {
    @Override
    public String solve(int A) {
        if (A == 2) {
            return "Donny";
        } else {
            return "Ponny";
        }
    }

    private boolean isPowerOfTwo(int number) {
        if (number == 0) {
            return false;
        }

        while (number != 1) {
            if (number % 2 != 0) {
                return false;
            }
            number = number / 2;
        }
        return true;
    }
}
