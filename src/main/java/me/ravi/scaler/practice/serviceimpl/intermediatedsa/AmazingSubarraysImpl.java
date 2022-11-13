package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.AmazingSubarrays;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class AmazingSubarraysImpl implements AmazingSubarrays {
    @Override
    public int solve(String A) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        long noOfVowels = 0;
        long amazingSubArrays = 0;
        for (int i = 0; i < A.length(); i++) {
            if (vowels.contains(A.charAt(i))) {
                ++noOfVowels;
            }
            amazingSubArrays += noOfVowels;
        }
        return (int) (amazingSubArrays % 10003);
    }
}
