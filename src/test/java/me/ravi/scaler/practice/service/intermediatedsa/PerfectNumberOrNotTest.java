package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PerfectNumberOrNotTest {

    int A;
    int expectedOutput;

    @Autowired
    PerfectNumberOrNot perfectNumberOrNot;

    @AfterEach
    public void checkAnswer() {
        assertEquals(expectedOutput, perfectNumberOrNot.solve(A));
    }

    @Test
    public void scenario1() {
        A = 4;
        expectedOutput = 0;
    }

    @Test
    public void scenario2() {
        A = 6;
        expectedOutput = 1;
    }

    @Test
    public void scenario3() {
        A = 1;
        expectedOutput = 0;
    }

    @Test
    public void scenario4() {
        A = 28;
        expectedOutput = 1;
    }

}