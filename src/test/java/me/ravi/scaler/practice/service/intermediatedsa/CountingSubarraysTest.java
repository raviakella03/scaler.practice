package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CountingSubarraysTest {

    @Autowired
    private CountingSubarrays countingSubarrays;

    private ArrayList<Integer> A;
    private int B;
    private int expectedOutput;

    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, countingSubarrays.solve(A, B));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(2, 5, 6));
        B = 10;
        expectedOutput = 4;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(1, 11, 2, 3, 15));
        B = 10;
        expectedOutput = 4;
    }

}