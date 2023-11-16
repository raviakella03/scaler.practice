package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ElementsRemovalTest extends AbstractTest {

    @Autowired
    ElementsRemoval elementsRemoval;
    ArrayList<Integer> A;
    int expectedOutput;

    /**
     *
     */
    @Override
    public void checkOutput() {
        assertEquals(expectedOutput, elementsRemoval.solve(A));
    }

    @Test
    @DisplayName("Scenario 1")
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(2, 1));
        expectedOutput = 4;
    }

    @Test
    @DisplayName("Scenario 2")
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(5));
        expectedOutput = 5;
    }
}