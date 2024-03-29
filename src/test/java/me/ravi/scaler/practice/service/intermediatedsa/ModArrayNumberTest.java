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
class ModArrayNumberTest extends AbstractTest {

    @Autowired
    ModArrayNumber modArrayNumber;
    ArrayList<Integer> A;
    int B;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, modArrayNumber.solve(A, B));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(1, 4, 3));
        B = 2;
        expectedOutput = 1;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(4, 3, 5, 3, 5, 3, 2, 1));
        B = 47;
        expectedOutput = 20;
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>(Arrays.asList(4, 5, 8, 9, 0, 8, 8, 2, 2, 5, 8, 4, 1, 5, 8, 9, 1, 1, 2, 4, 4, 0, 5, 5, 7, 8, 3, 5, 8, 9, 3, 7, 8, 6, 8, 7, 8, 6, 8, 0, 7, 5, 3, 9, 6, 0, 3, 9, 4, 8, 8, 4, 7, 6, 6, 1, 3, 4, 6, 8, 8, 0, 6, 3, 8, 5, 1, 5, 4, 8, 8, 2, 2, 1, 9, 5, 3, 5, 5, 1, 8, 1, 7, 7, 8, 0, 8, 1, 9, 2, 9, 7, 0, 8, 1, 7, 7, 5, 7, 8, 9, 3, 9, 4, 7, 1, 5, 4, 8, 1, 4, 6, 1, 9, 9, 0, 8, 3, 0, 3, 9, 7, 6, 6, 4, 7, 6, 2, 2, 4, 4, 7, 0, 1, 2, 8, 9, 8, 4, 9, 7, 8, 8, 4, 0, 7, 3, 1, 2, 5, 8, 4, 4, 2, 3, 7, 1, 1, 8, 1, 7, 6, 7, 4, 9, 2, 0, 5, 8, 3, 0, 0, 9, 8, 1, 3, 0, 3, 3, 0, 4, 2, 7, 3, 7, 1, 1, 2, 7, 1, 6, 5, 3, 8, 6, 6, 2, 9, 5, 0, 2, 8, 3, 2, 5, 9, 4, 4, 5, 5, 1, 4, 4, 2, 3, 0, 2, 0, 1, 6, 2, 5, 4, 1, 3, 3, 2, 6, 7, 5, 7, 4, 9, 1, 2, 4, 9, 9, 8, 5, 9, 7, 6, 2, 9, 3, 6, 3, 2, 0, 7, 2, 0, 8, 5, 0, 9, 3, 7, 2, 1, 0, 1, 9, 1, 5, 6, 6, 9, 8, 5, 5, 3, 2, 1, 4, 0));
        B = 52;
        expectedOutput = 16;
    }
}