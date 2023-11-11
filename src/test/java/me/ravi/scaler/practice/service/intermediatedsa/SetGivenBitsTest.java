package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SetGivenBitsTest extends AbstractTest {

    @Autowired
    SetGivenBits setGivenBits;
    int A;
    int B;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, setGivenBits.solve(A, B));
    }

    @Test
    public void scenario1() {
        A = 3;
        B = 5;
        expectedOutput = 40;
    }

    @Test
    public void scenario2() {
        A = 4;
        B = 4;
        expectedOutput = 16;
    }
}