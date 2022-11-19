package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GoodSubarraysTest {

    @Autowired
    GoodSubarrays goodSubarrays;
    ArrayList<Integer> A;
    int referenceSum;
    int expectedOutput;


    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, goodSubarrays.solve(A, referenceSum));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(9, 12, 17, 9, 17, 16, 6, 4, 3, 8, 5, 13, 2, 9, 3, 13, 11));
        referenceSum = 302;
        expectedOutput = 72;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(3, 12, 11, 11, 11, 15));
        referenceSum = 12;
        expectedOutput = 7;
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        referenceSum = 5;
        expectedOutput = 5;
    }

    @Test
    public void scenario4() {
        A = new ArrayList<>(Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9));
        referenceSum = 65;
        expectedOutput = 36;
    }
}