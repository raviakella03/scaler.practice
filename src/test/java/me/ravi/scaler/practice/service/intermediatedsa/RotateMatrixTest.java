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
class RotateMatrixTest extends AbstractTest {

    @Autowired
    RotateMatrix rotateMatrix;
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    ArrayList<ArrayList<Integer>> expectedOutput = new ArrayList<>();

    @Override
    @AfterEach
    public void checkOutput() {
        rotateMatrix.solve2(A);
        assertIterableEquals(expectedOutput, A);
        A.clear();
        expectedOutput.clear();
    }

    @Test
    public void scenario1() {
        A.add(new ArrayList<>(Arrays.asList(1, 2)));
        A.add(new ArrayList<>(Arrays.asList(3, 4)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(3, 1)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(4, 2)));
    }

    @Test
    public void scenario2() {
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(7, 4, 1)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(8, 5, 2)));
        expectedOutput.add(new ArrayList<>(Arrays.asList(9, 6, 3)));
    }
}