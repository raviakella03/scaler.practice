package me.ravi.scaler.practice.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimpleRecursionTest {

    private int A, B;
    private int expectedOutput;

    @Autowired
    SimpleRecursion simpleRecursion;

    @AfterEach
    public void testEquality(){
        assertEquals(expectedOutput, simpleRecursion.solve(A, B));
    }

    @Test
    public void scenario1() {
        A = 3;
        B = 5;
        expectedOutput = 243;
    }
}