package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ModArrayNumber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ModArrayNumberImpl implements ModArrayNumber {
    /**
     * @param A
     * @param B
     * @return
     */
    @Override
    public int solve(ArrayList<Integer> A, int B) {
        int sizeOfArray = A.size();
        long number = 0;
        long tenPowerContribution = 1;
        for (int i = sizeOfArray - 1; i >= 0; i--) {
            number = (number + A.get(i) * tenPowerContribution) % B;
            tenPowerContribution = (tenPowerContribution * 10) % B;
        }
        return (int) number;
    }
}
