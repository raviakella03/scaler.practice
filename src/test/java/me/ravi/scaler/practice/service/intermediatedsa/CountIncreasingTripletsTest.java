package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CountIncreasingTripletsTest extends AbstractTest {
    @Autowired
    CountIncreasingTriplets countIncreasingTriplets;

    int expectedOutput;
    ArrayList<Integer> A;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, countIncreasingTriplets.solve(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(1, 2, 4, 3));
        expectedOutput = 2;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(2, 1, 2, 3));
        expectedOutput = 1;
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>(Arrays.asList(4, 1, 2, 6, 9, 7));
        expectedOutput = 9;
    }
}