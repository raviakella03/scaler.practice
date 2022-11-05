package me.ravi.scaler.practice.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PonnyDonnyGameTest {
    int A;
    String expectedOutput;
    @Autowired
    PonnyDonnyGame ponnyDonnyGame;

   /* @AfterEach
    public void testEquality() {
        assertEquals(expectedOutput, ponnyDonnyGame.solve(A));
    }*/

    @Test
    public void scenario1() {
        A = 1;
        expectedOutput = "Ponny";
    }

    @Test
    public void scenario2() {
        A = 2;
        expectedOutput = "Donny";
    }

    @Test
    public void scenrio3() {
        double powerE = Math.pow(7, 996);
        System.out.println(powerE);
        System.out.println(((int) Math.pow(7, 996)) % 1000);
    }
}