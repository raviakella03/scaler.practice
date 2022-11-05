package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrimeOrNotTest {

    Long A;
    int expectedOutput;

    @Autowired
    PrimeOrNot primeOrNot;

    @AfterEach
    public void checkAnswer() {
        assertEquals(expectedOutput, primeOrNot.solve(A));
    }

    @Test
    public void scenario1() {
        A = Long.valueOf("2");
        expectedOutput = 1;
    }

    @Test
    public void scenario2() {
        A = 5L;
        expectedOutput = 1;
    }

    @Test
    public void scenario3() {
        A = 10L;
        expectedOutput = 0;
    }

}