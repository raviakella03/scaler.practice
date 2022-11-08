package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClosestMinMaxTest {

    private ArrayList<Integer> A;
    private int expectedOutput;

    @Autowired
    private ClosestMinMax closestMinMax;

    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, closestMinMax.solve(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(814, 761, 697, 483, 981));
        expectedOutput = 2;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(613, 116, 420, 672, 426));
        expectedOutput = 3;
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4));
        expectedOutput = 1;
    }

    @Test
    public void scenario4() {
        A = new ArrayList<>(Arrays.asList(834, 563, 606, 221, 165));
        expectedOutput = 5;
    }
}