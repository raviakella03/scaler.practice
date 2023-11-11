package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.CheckBit;
import org.springframework.stereotype.Service;

@Service
public class CheckBitImpl implements CheckBit {
    /**
     * @param A
     * @param B
     * @return
     */
    @Override
    public int solve(int A, int B) {
        if ((A | (1 << B)) == A) {
            return 1;
        } else {
            return 0;
        }
    }
}
