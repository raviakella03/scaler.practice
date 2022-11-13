package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AmazingSubarraysTest {
    @Autowired
    AmazingSubarrays amazingSubarrays;

    String A;
    int expectedOutput;

    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, amazingSubarrays.solve(A));
    }

    @Test
    public void scenario1() {
        A = "ABEC";
        expectedOutput = 6;
    }

    @Test
    public void scenario2() {
        A = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
        expectedOutput = 1244;
    }

    @Test
    public void scenario3() {
        A = "AEIOU";
        expectedOutput = 15;
    }

}