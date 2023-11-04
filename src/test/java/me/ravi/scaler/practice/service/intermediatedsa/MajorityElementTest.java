package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MajorityElementTest extends AbstractTest {

    @Autowired
    MajorityElement majorityElement;
    List<Integer> A;
    int expectedOutput;

    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, majorityElement.majorityElement(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(2, 1, 2));
        expectedOutput = 2;
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(1, 1, 1));
        expectedOutput = 1;
    }
}