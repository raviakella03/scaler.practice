package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.TimeToEquality;

import java.util.ArrayList;

public class TimeToEqualityImpl implements TimeToEquality {
    @Override
    public int solve(ArrayList<Integer> A) {
        int seconds = 0;
        int max = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        for (int i = 0; i < A.size(); i++) {
            seconds += max - A.get(i);
        }
        return seconds;
    }
}
