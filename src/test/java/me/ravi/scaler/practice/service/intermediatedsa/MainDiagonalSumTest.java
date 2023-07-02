package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MainDiagonalSumTest extends AbstractTest {

    @Autowired
    MainDiagonalSum mainDiagonalSum;
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, mainDiagonalSum.solve(A));
    }

    @BeforeEach
    public void initialize() {
        A = new ArrayList<>();
    }

    @Test
    public void scenario1() {
        A.add(new ArrayList<>(Arrays.asList(1, -2, -3)));
        A.add(new ArrayList<>(Arrays.asList(-4, 5, -6)));
        A.add(new ArrayList<>(Arrays.asList(-7, -8, 9)));
        expectedOutput = 15;
    }

    @Test
    public void scenario2() {
        A.add(new ArrayList<>(Arrays.asList(3, 2)));
        A.add(new ArrayList<>(Arrays.asList(2, 3)));
        expectedOutput = 6;
    }
}