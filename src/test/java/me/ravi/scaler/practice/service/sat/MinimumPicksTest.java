package me.ravi.scaler.practice.service.sat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MinimumPicksTest {

    ArrayList<Integer> A = new ArrayList<>();
    int expectedOutput;

    @Autowired
    MinimumPicks minimumPicks;

    @AfterEach
    public void checkAnswer() {
        assertEquals(expectedOutput, minimumPicks.solve(A));
        A.clear();
    }

    @Test
    public void scenario1() {
        A.add(0);
        A.add(2);
        A.add(9);
        expectedOutput = -7;
    }

    @Test
    public void scenario2() {
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(1);
        expectedOutput = 99;
    }
}