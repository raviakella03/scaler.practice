package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.JosephusProblem;
import org.springframework.stereotype.Service;

@Service
public class JosephusProblemImpl implements JosephusProblem {
    /**
     * @param A
     * @return
     */
    @Override
    public int solve(int A) {
        int lastManStanding;
        int noOfKillings = 0;
        for (int i = A; i >= 1; i--) {
            if ((i & i - 1) == 0) {
                break;
            }
            ++noOfKillings;
        }
        lastManStanding = 1 + 2 * noOfKillings;
        return lastManStanding;
    }

    /**
     * @param A
     * @param startingPerson
     * @return
     */
    @Override
    public int solve(int A, int startingPerson) {
        int lastManStanding;
        int noOfKillings = 0;
        for (int i = A; i >= 1; i--) {
            if ((i & i - 1) == 0) {
                break;
            }
            ++noOfKillings;
        }
        lastManStanding = startingPerson + 2 * noOfKillings;
        if (lastManStanding > A) {
            lastManStanding -= A;
        }
        return lastManStanding;
    }
}
