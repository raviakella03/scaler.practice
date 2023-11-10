package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SingleNumberTest extends AbstractTest {

    @Autowired
    SingleNumber singleNumber;
    List<Integer> A;
    int expectedOutput;

    /**
     *
     */
    @Override
    public void checkOutput() {
        assertEquals(expectedOutput, singleNumber.singleNumber(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1));
        expectedOutput = 3;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(4, 4, 51, 2, 2, 3, 1, 3));
        expectedOutput = 51;
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>(Arrays.asList(1, 2, 2));
        expectedOutput = 1;
    }
}