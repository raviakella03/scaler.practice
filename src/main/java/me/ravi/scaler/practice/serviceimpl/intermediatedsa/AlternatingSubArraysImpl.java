package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import lombok.extern.slf4j.Slf4j;
import me.ravi.scaler.practice.service.intermediatedsa.AlternatingSubArrays;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class AlternatingSubArraysImpl implements AlternatingSubArrays {

    /**
     * Here is the pseudo-code for the given code:
     * <p>
     * Initialize an empty integer vector l1 to store the indices of the alternating subarrays.
     * Check the constraints for the input array A and integer B.
     * Get the size of the input array A and calculate the length of the alternating subarray (len) as 2 * B + 1.
     * Iterate over the indices of the input array A from 0 to n - len + 1:
     * a. Initialize a variable curr to -1 to keep track of the current element in the subarray.
     * b. Initialize a flag variable to 1, indicating that the current subarray is alternating.
     * c. Iterate over the elements in the subarray from index i to i + len:
     * - If the current element is equal to curr, set the flag to 0 and break the loop.
     * - Otherwise, update the curr variable with the current element.
     * d. If the flag is still 1 after the inner loop, it means the subarray is alternating.
     * - Add the index i + B to the l1 vector.
     * Return the l1 vector containing the indices of the alternating subarrays.
     * Note: Make sure to handle the 0-based indexing while adding the indices to the l1 vector.
     */
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> alternatingSubArrayCentreIndexList = new ArrayList<>();
        int inputArrayLength = A.size();
        int subArrayLength = 2 * B + 1;
        if (A.size() < 1 || A.size() > 1000 || B < 0 || B > (A.size() - 1) / 2) {
            return alternatingSubArrayCentreIndexList;
        }
        for (int i = 0; i < inputArrayLength - subArrayLength + 1; i++) {
            int currentElement = -1;
            boolean alternatingSubArray = true;
            for (int j = i; j < i + subArrayLength; j++) {
                if (currentElement == A.get(j)) {
                    alternatingSubArray = false;
                    break;
                } else {
                    currentElement = A.get(j);
                }
            }
            if (alternatingSubArray) {
                alternatingSubArrayCentreIndexList.add(i + B);
            }
        }
        return alternatingSubArrayCentreIndexList;
    }

    @Override
    public ArrayList<Integer> solve2(ArrayList<Integer> A, int B) {
        ArrayList<Integer> alternatingSubArrayCentreIndex = new ArrayList<>();
        if (A.size() < 1 || A.size() > 1000 || B < 0 || B > (A.size() - 1) / 2) {
            return alternatingSubArrayCentreIndex;
        }
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                ArrayList<Integer> subArray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subArray.add(A.get(k));
                }
                if (subArray.size() == (2 * B + 1)) {
                    log.info(String.valueOf(subArray));
                    Integer index = qualifiedSubArrayIndex(subArray);
                    if (null != index) {
                        alternatingSubArrayCentreIndex.add(qualifiedSubArrayIndex(subArray) + i);
                    }
                }
            }

        }
        log.info(String.valueOf(alternatingSubArrayCentreIndex));
        return alternatingSubArrayCentreIndex;
    }

    private Integer qualifiedSubArrayIndex(ArrayList<Integer> subArray) {
        Integer index;
        int previousNumber = subArray.get(0);
        for (int i = 1; i < subArray.size(); i++) {
            if (previousNumber == 0) {
                if (subArray.get(i) == 1) {
                    previousNumber = 1;
                } else {
                    return null;
                }
            } else if (previousNumber == 1) {
                if (subArray.get(i) == 0) {
                    previousNumber = 0;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        index = subArray.size() / 2;
        return index;
    }
}
