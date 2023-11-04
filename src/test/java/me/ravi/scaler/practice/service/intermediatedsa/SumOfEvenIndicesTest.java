package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@SpringBootTest
class SumOfEvenIndicesTest extends AbstractTest {

    @Autowired
    private SumOfEvenIndices sumOfEvenIndices;
    private ArrayList<Integer> A;
    private ArrayList<ArrayList<Integer>> B = new ArrayList<>();
    private ArrayList<Integer> expectedOutput;

    @Override
    @AfterEach
    public void checkOutput() {
        assertIterableEquals(expectedOutput, sumOfEvenIndices.solve(A, B));
        B.clear();
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        B.add(new ArrayList<>(Arrays.asList(0, 2)));
        B.add(new ArrayList<>(Arrays.asList(1, 4)));
        expectedOutput = new ArrayList<>(Arrays.asList(4, 8));
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(2, 1, 8, 3, 9));
        B.add(new ArrayList<>(Arrays.asList(0, 3)));
        B.add(new ArrayList<>(Arrays.asList(2, 4)));
        expectedOutput = new ArrayList<>(Arrays.asList(10, 17));
    }
}