package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SumOfAllSubArraysTest {
    int expectedOutput;
    @Autowired
    private SumOfAllSubArrays sumOfAllSubArrays;
    private ArrayList<Integer> A = new ArrayList<>();

    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, sumOfAllSubArrays.subarraySum(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(1, 2, 3));
        expectedOutput = 20;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(2, 1, 3));
        expectedOutput = 19;
    }
}