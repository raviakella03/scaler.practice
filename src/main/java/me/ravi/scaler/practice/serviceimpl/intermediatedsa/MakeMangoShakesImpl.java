package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.MakeMangoShakes;
import org.springframework.stereotype.Service;

@Service
public class MakeMangoShakesImpl implements MakeMangoShakes {
    @Override
    public int solve(int A, int B) {
        return (A * 3 + B) / 2;
    }
}
