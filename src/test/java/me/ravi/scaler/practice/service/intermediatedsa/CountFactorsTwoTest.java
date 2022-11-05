package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CountFactorsTwoTest {

    private int A;
    private int expectedOutput;
    @Autowired
    private CountFactorsTwo countFactorsTwo;

    @Test
    public void scenario1() {
        A = 2;
        expectedOutput = 2;
        assertEquals(expectedOutput, countFactorsTwo.solve(A));
    }

    @Test
    public void scenario2() {
        A = 11;
        expectedOutput = 2;
        assertEquals(expectedOutput, countFactorsTwo.solve(A));
    }

    @Test
    public void scenario3() {
        A = 10;
        expectedOutput = 4;
        assertEquals(expectedOutput, countFactorsTwo.solve(A));
    }

    @Test
    public void scenario4() {
        A = 1;
        expectedOutput = 1;
        assertEquals(expectedOutput, countFactorsTwo.solve(A));
    }

    @Test
    public void scenario5() {
        A = 49;
        expectedOutput = 3;
        assertEquals(expectedOutput, countFactorsTwo.solve(A));
    }

    @Test
    public void scenario6() {
        A = 16;
        expectedOutput = 5;
        assertEquals(expectedOutput, countFactorsTwo.solve(A));
    }

    @Test
    public void scenario7() {
        A = 735684590;
        expectedOutput = 16;
        assertEquals(expectedOutput, countFactorsTwo.solve(A));
    }
}