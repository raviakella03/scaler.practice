package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.MajorityElement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorityElementImpl implements MajorityElement {
    /**
     * @param A
     * @return
     */
    @Override
    public int majorityElement(List<Integer> A) {
        int majorityElementIndex = 0;
        int majorityCount = 1;
        /*for (int i = 0; i < A.size(); i++) {
            if (A.get(majorityElementIndex).equals(A.get(i))) {
                ++majorityCount;
            } else {
                --majorityCount;
            }

            if (majorityCount == 0) {
                majorityElementIndex = i;
                majorityCount = 1;
            }
        }*/
        for (int i = 0; i < A.size(); i++) {
            if (A.get(majorityElementIndex).equals(A.get(i))) {
                ++majorityCount;
            } else {
                --majorityCount;
            }

            if (majorityCount == 0) {
                majorityElementIndex = i;
                majorityCount = 1;
            }
        }
        return A.get(majorityElementIndex);
    }
}
