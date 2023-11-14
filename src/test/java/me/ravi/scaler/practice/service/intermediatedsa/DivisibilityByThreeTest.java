package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DivisibilityByThreeTest extends AbstractTest {

    @Autowired
    DivisibilityByThree divisibilityByThree;
    ArrayList<Integer> A;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, divisibilityByThree.solve(A));
    }

    @Test
    @DisplayName("Scenario 1")
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(1, 2, 3));
        expectedOutput = 1;
    }

    @Test
    @DisplayName("Scenario 2")
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(1, 0, 0, 1, 2));
        expectedOutput = 0;
    }
}