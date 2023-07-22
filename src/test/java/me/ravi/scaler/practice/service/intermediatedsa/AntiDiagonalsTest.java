package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@SpringBootTest
class AntiDiagonalsTest {
    @Autowired
    private AntiDiagonals antiDiagonals;
    private ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> expectedOutput = new ArrayList<>();
    ;

    @AfterEach
    public void checkOutput() {
        assertIterableEquals(expectedOutput, antiDiagonals.diagonal(A));
        A.clear();
        expectedOutput.clear();
    }

    @Test
    public void scenario1() {
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(1, 0, 0)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(2, 4, 0)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(3, 5, 7)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(6, 8, 0)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(9, 0, 0)));
    }

    @Test
    public void scenario2() {
        A.add(new ArrayList<>(Arrays.asList(1, 2)));
        A.add(new ArrayList<>(Arrays.asList(3, 4)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(1, 0)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(2, 3)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(4, 0)));
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>();
        expectedOutput = new ArrayList<>();
    }

    @Test
    public void scenario4() {
        A = new ArrayList<>();
        expectedOutput = new ArrayList<>();
    }

    @Test
    public void scenario5() {
        A = new ArrayList<>();
        expectedOutput = new ArrayList<>();
    }
}