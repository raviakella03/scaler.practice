package me.ravi.scaler.practice.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AdjacentSumEvenTest {

    @Autowired
    private AdjacentSumEven adjacentSumEven;

    private ArrayList<Integer> A = new ArrayList<>();
    private int expectedOutput;

    @AfterEach
    public void testEquality() {
        assertEquals(expectedOutput, adjacentSumEven.solve(A));
        A.clear();
    }

    @Test
    public void scenario1() {
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        expectedOutput = 2;
    }

    @Test
    public void scenario2() {
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(11);
        expectedOutput = 1;
    }
}