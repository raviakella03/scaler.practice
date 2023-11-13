package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NumberOfOneBitsTest extends AbstractTest {

    @Autowired
    NumberOfOneBits numberOfOneBits;
    int A;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, numberOfOneBits.numSetBits(A));
    }

    @Test
    public void scenario1() {
        A = 11;
        expectedOutput = 3;
    }

    @Test
    public void scenario2() {
        A = 6;
        expectedOutput = 2;
    }

    @Test
    public void scenario3() {
        A = 0;
        expectedOutput = 0;
    }
}