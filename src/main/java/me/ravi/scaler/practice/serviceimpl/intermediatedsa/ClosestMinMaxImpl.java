package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ClosestMinMax;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClosestMinMaxImpl implements ClosestMinMax {
    @Override
    public int solve(ArrayList<Integer> A) {
        int min = A.get(0);
        int max = A.get(0);
        int maxIndex = -1;
        int minIndex = -1;
        int minLength = A.size();

        /**
         * Finding min in the array
         */
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) < min) {
                min = A.get(i);
            }
        }
        /**
         * Finding max in the array
         */
        for (int i = 1; i < A.size(); i++) {
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

            if (minLength == -1) {
                minLength = Math.abs(minIndex - maxIndex) + 1;
            } else if (minLength == 1) {
                break;
            } else if (minLength > Math.abs(minIndex - maxIndex) + 1) {
                minLength = Math.abs(minIndex - maxIndex) + 1;
            }

            if (A.get(i) == max) {
                minIndex = -1;
            } else if (A.get(i) == min) {
                maxIndex = -1;
            }
        }
        return minLength;
    }
}
