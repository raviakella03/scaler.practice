package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.SpecialSubsequences;

public class SpecialSubsequencesImpl implements SpecialSubsequences {
    @Override
    public int solve(String A) {
        double pairCount = 0;
        double aCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                ++aCount;
            }
            if (A.charAt(i) == 'G') {
                pairCount += aCount;
            }
        }
        return (int) (pairCount % (Math.pow(10, 9) + 7));
    }
}
