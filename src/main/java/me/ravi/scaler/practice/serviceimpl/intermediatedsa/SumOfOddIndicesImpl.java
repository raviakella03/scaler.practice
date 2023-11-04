package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import lombok.extern.slf4j.Slf4j;
import me.ravi.scaler.practice.service.intermediatedsa.SumOfOddIndices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class SumOfOddIndicesImpl implements SumOfOddIndices {
    /**
     * @param A
     * @param B
     * @return
     */
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> sumOfOddIndices = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
            int startIndex = B.get(i).get(0);
            int endIndex = B.get(i).get(1);
            int sum = 0;
            for (int j = startIndex; j <= endIndex; j++) {
                if (j % 2 != 0) {
                    sum += A.get(j);
                }
            }
            sumOfOddIndices.add(sum);
        }
        return sumOfOddIndices;
    }
}
