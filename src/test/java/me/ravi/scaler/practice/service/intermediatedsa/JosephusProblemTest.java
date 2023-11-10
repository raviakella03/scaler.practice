package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JosephusProblemTest extends AbstractTest {
    @Autowired
    JosephusProblem josephusProblem;
    int expectedOutput;
    int actualOutput;
    int A;
    int startingPerson;

    /**
     * Asserts the output
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void scenario1() {
        A = 100;
        expectedOutput = 73;
        actualOutput = josephusProblem.solve(A);
    }

    @Test
    public void scenario2() {
        A = 100;
        startingPerson = 1;
        expectedOutput = 73;
        actualOutput = josephusProblem.solve(A, startingPerson);
    }

    @Test
    public void scenario3() {
        A = 100;
        startingPerson = 3;
        expectedOutput = 75;
        actualOutput = josephusProblem.solve(A, startingPerson);
    }

    @Test
    public void scenario4() {
        A = 12;
        startingPerson = 11;
        expectedOutput = 7;
        actualOutput = josephusProblem.solve(A, startingPerson);
    }

    @Test
    public void scenario5() {
        A = 12;
        startingPerson = 12;
        expectedOutput = 8;
        actualOutput = josephusProblem.solve(A, startingPerson);
    }
}