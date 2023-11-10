package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.SingleNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleNumberImpl implements SingleNumber {
    /**
     * @param A
     * @return
     */
    @Override
    public int singleNumber(List<Integer> A) {
        int answer = 0;
        for (Integer entry : A) {
            answer ^= entry;
        }
        return answer;
    }
}
