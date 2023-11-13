package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.NumberOfOneBits;
import org.springframework.stereotype.Service;

@Service
public class NumberOfOneBitsImpl implements NumberOfOneBits {
    /**
     * @param A
     * @return
     */
    @Override
    public int numSetBits(int A) {
        int noOfOneBits = 0;
        while (A > 0) {
            if ((A & 1) == 1) {
                ++noOfOneBits;
            }
            A = A >> 1;
        }
        return noOfOneBits;
    }
}
