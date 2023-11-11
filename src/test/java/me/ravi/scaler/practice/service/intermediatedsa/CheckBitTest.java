package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CheckBitTest extends AbstractTest {

    @Autowired
    CheckBit checkBit;
    int A;
    int B;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, checkBit.solve(A, B));
    }

    @Test
    public void scenario1() {
        A = 4;
        B = 1;
        expectedOutput = 0;
    }

    @Test
    public void scenario2() {
        A = 5;
        B = 2;
        expectedOutput = 1;
    }
}