package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class ColumnSumTest {

    int[][] A;
    int[] expectedOutput;
    @Autowired
    private ColumnSum columnSum;

    @AfterEach
    public void checkOutput() {
        assertArrayEquals(expectedOutput, columnSum.solve(A));
    }

    @Test
    public void scenario1() {
        A = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        expectedOutput = new int[]{15, 10, 13, 16};
    }

    @Test
    public void scenario2() {
        A = new int[][]{{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}};
        expectedOutput = new int[]{65, 70, 75, 80, 85, 90};
    }

    @Test
    public void scenario3() {
        A = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        expectedOutput = new int[]{15, 18, 21, 24};
    }
}