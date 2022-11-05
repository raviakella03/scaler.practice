package me.ravi.scaler.practice.serviceimpl.sat;

import me.ravi.scaler.practice.service.sat.Power;

public class PowerImpl implements Power {
    @Override
    public int pow(int A, int B, int C) {
        return (int) Math.abs(Math.pow(A, B) % C);
    }
}
