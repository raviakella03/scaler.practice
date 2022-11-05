package me.ravi.scaler.practice.service.sat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTest {

    int A, B, C;

    int expectedOutput;

    @Autowired
    Power power;

    @Autowired
    public void checkResult() {
        assertEquals(expectedOutput, power.pow(A, B, C));
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
        A = -2;
        B = 3;
        C = 3;
        expectedOutput = 2;
    }

    @Test
    public void scenario3() {
        A = -1;
        B = 3;
        C = 3;
        expectedOutput = 1;
    }
}