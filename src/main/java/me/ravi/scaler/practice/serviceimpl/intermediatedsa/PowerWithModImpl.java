package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.PowerWithMod;
import org.springframework.stereotype.Service;

@Service
public class PowerWithModImpl implements PowerWithMod {
    /**
     * @param A
     * @param B
     * @param C
     * @return
     */
    @Override
    public int solve(int A, int B, int C) {
        long outputMod = 1;
        for (int i = 1; i <= B; i++) {
            outputMod = ((outputMod % C) * (A % C)) % C;
        }
        return (int) outputMod;
    }
}
