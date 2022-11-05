package me.ravi.scaler.practice.serviceimpl.sat;

import me.ravi.scaler.practice.service.sat.MinimumPicks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MinimumPicksImpl implements MinimumPicks {
    @Override
    public int solve(ArrayList<Integer> A) {
        int minOdd = A.get(0);
        int maxEven = A.get(0);
        int left = 0;
        int right = A.size() - 1;
        while (left <= right) {
            if (A.get(left) % 2 == 0) {
                if (maxEven == 0) {
                    maxEven = A.get(left);
                } else {
                    if (A.get(left) > maxEven) {
                        maxEven = A.get(left);
                    }
                }
            } else {
                if (minOdd == 0) {
                    minOdd = A.get(left);
                } else {
                    if (A.get(left) < minOdd) {
                        minOdd = A.get(left);
                    }
                }
            }
            if (A.get(right) % 2 == 0) {
                if (maxEven == 0) {
                    maxEven = A.get(left);
                } else {
                    if (A.get(right) > maxEven) {
                        maxEven = A.get(right);
                    }
                }
            } else {
                if (minOdd == 0) {
                    minOdd = A.get(right);
                } else {
                    if (A.get(right) < minOdd) {
                        minOdd = A.get(right);
                    }
                }
            }
            ++left;
            --right;
            System.out.println(maxEven);
            System.out.println(minOdd);
        }
        return maxEven - minOdd;
    }
}
