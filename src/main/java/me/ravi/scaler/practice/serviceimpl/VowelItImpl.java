package me.ravi.scaler.practice.serviceimpl;

import me.ravi.scaler.practice.service.VowelIt;
import org.springframework.stereotype.Service;

@Service
public class VowelItImpl implements VowelIt {
    private String vowelItString;
    public String solve(String A) {
        vowelItString = "";
        for (char c : A.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelItString += c;
            }
        }
        return vowelItString;
    }
}
