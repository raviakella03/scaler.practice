package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CountOfPrimesTest {

    int A;
    int expectedOutput;

    @Autowired
    CountOfPrimes countOfPrimes;

    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, countOfPrimes.solve(A));
    }

    @Test
    public void scenario1() {
        A = 19;
        expectedOutput = 8;
    }

    @Test
    public void scenario0() {
        A = 1;
        expectedOutput = 0;
    }

}