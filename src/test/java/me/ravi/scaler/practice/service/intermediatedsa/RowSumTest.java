package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@SpringBootTest
class RowSumTest extends AbstractTest {

    @Autowired
    RowSum rowSum;
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    ArrayList<Integer> expectedResult;

    @Override
    public void checkOutput() {
        assertIterableEquals(expectedResult, rowSum.solve(A));
        A.clear();
    }

    @Test
    public void scenario1() {
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        A.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        A.add(new ArrayList<>(Arrays.asList(9, 2, 3, 4)));
        expectedResult = new ArrayList<>(Arrays.asList(10, 26, 18));
    }
}