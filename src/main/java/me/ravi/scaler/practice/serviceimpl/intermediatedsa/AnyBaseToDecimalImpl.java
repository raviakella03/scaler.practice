package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.AnyBaseToDecimal;
import org.springframework.stereotype.Service;

@Service
public class AnyBaseToDecimalImpl implements AnyBaseToDecimal {
    /**
     * @param A
     * @param B
     * @return
     */
    @Override
    public int solve(int A, int B) {
        int decimalNumber = 0;
        int quotient = A;
        int remainder;
        int position = 0;
        do {
            remainder = quotient % 10;
            quotient = quotient / 10;
            decimalNumber += (int) (remainder * Math.pow(B, position));
            ++position;
        } while (quotient > 0);
        return decimalNumber;
    }
}
