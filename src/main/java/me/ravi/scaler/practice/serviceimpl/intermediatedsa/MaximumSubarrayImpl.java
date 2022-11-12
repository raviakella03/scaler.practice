package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.MaximumSubarray;

import java.util.ArrayList;

public class MaximumSubarrayImpl implements MaximumSubarray {

    /**
     * @param A Size of the input array
     * @param B Maximum limit of the subarray sum
     * @param C Integer Array
     * @return Maximum sub array sum
     * @Time_Complexity O(N * N)
     * @Space_Complexity O(1)
     */
    @Override
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int maxSubArraySum = 0;
        for (int i = 0; i < A; i++) {
            int sum = 0;
            for (int j = i; j < A; j++) {
                sum += C.get(j);
                if (sum >= maxSubArraySum && sum <= B) {
                    maxSubArraySum = sum;
                }
            }
        }
        return maxSubArraySum;
    }

    /**
     * @param A Size of the input array
     * @param B Maximum limit of the subarray sum
     * @param C Integer Array
     * @return Maximum sub array sum
     * @Time_Complexity O(N * N)
     * @Space_Complexity O(N)
     */
    public int maxSubarray2(int A, int B, ArrayList<Integer> C) {
        int maxSubArraySum = 0;
        int sum = Integer.MIN_VALUE;
        ArrayList<Integer> prefixSumArray = new ArrayList<>();
        createPrefixSumArray(C, prefixSumArray);
        for (int i = 0; i < A; i++) {
            for (int j = i; j < A; j++) {
                if (i == 0) {
                    sum = prefixSumArray.get(j);
                } else {
                    sum = prefixSumArray.get(j) - prefixSumArray.get(i - 1);
                }
                if (sum >= maxSubArraySum && sum <= B) {
                    maxSubArraySum = sum;
                }
            }
        }
        return maxSubArraySum;
    }

    private void createPrefixSumArray(ArrayList<Integer> C, ArrayList<Integer> prefixSumArray) {
        prefixSumArray.add(C.get(0));
        for (int i = 1; i < C.size(); i++) {
            prefixSumArray.add(prefixSumArray.get(i - 1) + C.get(i));
        }
    }

}
