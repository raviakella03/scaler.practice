package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.SetGivenBits;
import org.springframework.stereotype.Service;

@Service
public class SetGivenBitsImpl implements SetGivenBits {
    /**
     * @param A
     * @param B
     * @return
     */
    @Override
    public int solve(int A, int B) {
        int answer = 0;
        if (!isBitSet(answer, A)) {
            answer = answer | 1 << A;
        }

        if (!isBitSet(answer, B)) {
            answer = answer | 1 << B;
        }
        return answer;
    }

    boolean isBitSet(int answer, int bit) {
        return (answer | 1 << bit) == answer;
    }
}
