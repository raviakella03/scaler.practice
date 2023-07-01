package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@SpringBootTest
class RowSumTest extends AbstractTest {

    @Autowired
    RowSum rowSum;
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    ArrayList<Integer> expectedResult = new ArrayList<>();

    @Override
    public void checkOutput() {
        assertIterableEquals(expectedResult, rowSum.solve(A));
    }
}