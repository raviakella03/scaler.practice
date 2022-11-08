package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ClosestMinMax;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClosestMinMaxImpl implements ClosestMinMax {
    @Override
    public int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        int minLength = Integer.MAX_VALUE;

        /**
         * Finding min in the array
         */
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < min) {
                min = A.get(i);
            }
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        if (min == max) {
            return 1;
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == max) {
                maxIndex = i;
            } else if (A.get(i) == min) {
                minIndex = i;
            }
            if (minIndex == -1 || maxIndex == -1) {
                continue;
            }
            if (minLength == 1) {
                break;
            }
            minLength = Math.min(minLength, Math.abs(minIndex - maxIndex) + 1);
        }
        return minLength;
    }
}
