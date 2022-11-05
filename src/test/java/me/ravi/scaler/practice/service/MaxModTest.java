package me.ravi.scaler.practice.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class MaxModTest {

    private int expectedOutput;
    private ArrayList<Integer> A = new ArrayList<>();
    @Autowired
    private MaxMod maxMod;

    @BeforeEach
    public void setUp() {
        A.clear();
    }

    @AfterEach
    public void testEquality() {
        assertEquals(expectedOutput, maxMod.solve(A));
    }

    @Test
    public void scenario1() {
        A.add(1);
        A.add(2);
        A.add(44);
        A.add(3);
        expectedOutput = 3;
    }

    @Test
    public void scenario2() {
        A.add(2);
        A.add(6);
        A.add(4);
        expectedOutput = 4;
    }

    @Test
    public void scenario3() {
//        927, 707, 374, 394, 279, 799, 878, 937, 431, 112
        A.add(927);
        A.add(707);
        A.add(374);
        A.add(394);
        A.add(279);
        A.add(799);
        A.add(878);
        A.add(937);
        A.add(431);
        A.add(112);
        expectedOutput = 927;
    }
}