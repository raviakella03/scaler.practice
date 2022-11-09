package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.Bulbs;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BulbsImpl implements Bulbs {
    @Override
    public int bulbs(ArrayList<Integer> A) {
        int minSwitches = 0;
        if (A.get(0) == 0) {
            A.set(0, 1);
            ++minSwitches;
        }
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) == 0) {
                A.set(i, 1);
                if (minSwitches % 2 == 0) {
                    ++minSwitches;
                }
            } else if (A.get(i) == 1 && minSwitches % 2 != 0) {
                ++minSwitches;
            }
        }
        return minSwitches;
    }
}
