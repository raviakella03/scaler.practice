package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MakeMangoShakesTest {

    int A;
    int B;
    int expectedOutput;

    @Autowired
    MakeMangoShakes makeMangoShakes;

    @AfterEach
    public void checkAnswer() {
        assertEquals(expectedOutput, makeMangoShakes.solve(A, B));
    }

    @Test
    public void scenario1() {
        A = 19;
        B = 0;
        expectedOutput = 28;
    }

    @Test
    public void scenario2() {
        A = 7;
        B = 1;
        expectedOutput = 11;
    }

    @Test
    public void scenario3() {
        A = 0;
        B = 1;
        expectedOutput = 0;
    }

    @Test
    public void scenario4() {
        A = 0;
        B = 2;
        expectedOutput = 1;
    }

    @Test
    public void scenario5() {
        A = 0;
        B = 3;
        expectedOutput = 1;
    }

    @Test
    public void scenario6() {
        A = 0;
        B = 4;
        expectedOutput = 2;
    }

}