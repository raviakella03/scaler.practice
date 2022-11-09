package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BulbsTest {

    private ArrayList<Integer> A;
    private int expectedOutput;
    @Autowired
    private Bulbs bulbs;

    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, bulbs.bulbs(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
        expectedOutput = 0;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(0, 1, 0, 1));
        expectedOutput = 4;
    }
}