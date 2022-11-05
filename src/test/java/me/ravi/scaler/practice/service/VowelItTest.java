package me.ravi.scaler.practice.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class VowelItTest {

    private String A;
    private String expectedOutput;

    @Autowired
    private VowelIt vowelIt;

    @AfterEach
    public void testEquality() {
        log.debug("Input String - {}, Output String - {}", A, vowelIt.solve(A));
        assertEquals(expectedOutput, vowelIt.solve(A));
    }
    @Test
    public void scenario1() {
        A = "abcdye";
        expectedOutput = "ae";
    }

    @Test
    public void scenario2() {
        A = "abhishek";
        expectedOutput = "aie";
    }

    @Test
    public void scenario3() {
        A = "interviewbit";
        expectedOutput = "ieiei";
    }
}