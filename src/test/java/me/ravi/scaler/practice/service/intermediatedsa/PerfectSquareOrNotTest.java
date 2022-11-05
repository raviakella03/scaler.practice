package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PerfectSquareOrNotTest {

    @Autowired
    PerfectSquareOrNot perfectSquareOrNot;

    int A;
    int expectedOutput;

    @AfterEach
    public void checkAnswer() {
        assertEquals(expectedOutput, perfectSquareOrNot.solve(A));
    }

    @Test
    public void scenario1() {
        A = 4;
        expectedOutput = 2;
    }

    @Test
    public void scenario2() {
        A = 6;
        expectedOutput = -1;
    }
}