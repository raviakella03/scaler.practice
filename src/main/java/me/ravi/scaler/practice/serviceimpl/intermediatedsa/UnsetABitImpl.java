package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.UnsetABit;
import org.springframework.stereotype.Service;

@Service
public class UnsetABitImpl implements UnsetABit {
    /**
     * @param A
     * @param B
     * @return
     */
    @Override
    public int solve(int A, int B) {
        if (isBitSet(A, B)) {
            A = A ^ (1 << B);
        }
        return A;
    }

    boolean isBitSet(int answer, int bit) {
        return (answer | (1 << bit)) == answer;
    }
}
