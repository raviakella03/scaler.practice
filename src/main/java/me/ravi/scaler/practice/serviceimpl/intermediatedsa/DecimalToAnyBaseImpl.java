package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.DecimalToAnyBase;
import org.springframework.stereotype.Service;

@Service
public class DecimalToAnyBaseImpl implements DecimalToAnyBase {
    /**
     * @param A
     * @param B
     * @return
     */
    @Override
    public int aDecimalToAnyBase(int A, int B) {
        int convertedNumber = 0;
        int quotient = A;
        int remainder;
        int position = 0;
        do {
            remainder = quotient % B;
            quotient = quotient / B;
            convertedNumber += (int) (remainder * Math.pow(10, position));
            ++position;
        } while (quotient > 0);
        return convertedNumber;
    }
}
