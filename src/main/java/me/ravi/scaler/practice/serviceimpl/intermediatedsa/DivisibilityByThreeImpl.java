package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.DivisibilityByThree;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DivisibilityByThreeImpl implements DivisibilityByThree {
    /**
     * @param A
     * @return
     */
    @Override
    public int solve(ArrayList<Integer> A) {
        int ans = 0;
        for (Integer integer : A) {
            ans = (ans + (integer % 3)) % 3;
        }
        if (ans == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
