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
class SpecialIndexTest extends AbstractTest {

    @Autowired
    SpecialIndex specialIndex;
    ArrayList<Integer> A;
    int expectedOutput;


    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, specialIndex.solve(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(2, 1, 6, 4));
        expectedOutput = 1;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(1, 1, 1));
        expectedOutput = 3;
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 1, 2, 3));
        expectedOutput = 1;
    }
}