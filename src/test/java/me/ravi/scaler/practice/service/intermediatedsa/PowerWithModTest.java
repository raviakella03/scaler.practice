package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PowerWithModTest extends AbstractTest {

    @Autowired
    PowerWithMod powerWithMod;
    int A;
    int B;
    int C;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, powerWithMod.solve(A, B, C));
    }

    @Test
    public void scenario1() {
        A = 2;
        B = 3;
        C = 3;
        expectedOutput = 2;
    }

    @Test
    public void scenario2() {
        A = 5;
        B = 2;
        C = 4;
        expectedOutput = 1;
    }
}