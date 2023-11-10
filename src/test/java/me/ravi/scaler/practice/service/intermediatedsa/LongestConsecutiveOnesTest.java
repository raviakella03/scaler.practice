package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LongestConsecutiveOnesTest extends AbstractTest {
    @Autowired
    LongestConsecutiveOnes longestConsecutiveOnes;
    int expectedOutput;

    String A;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, longestConsecutiveOnes.solve(A));
    }

    @Test
    public void scenario1() {
        A = "111000";
        expectedOutput = 3;
    }

    @Test
    public void scenario2() {
        A = "111011101";
        expectedOutput = 7;
    }

    @Test
    public void scenario3() {
        A = "11110111111";
        expectedOutput = 10;
    }

    @Test
    public void scenario4() {
        A = "1111011111111110111111";
        expectedOutput = 17;
    }

    @Test
    public void scenario5() {
        A = "0111111111111111111111";
        expectedOutput = 21;
    }

    @Test
    public void scenario6() {
        A = "1111111111111111111110";
        expectedOutput = 21;
    }

    @Test
    public void scenario7() {
        A = "0000000000000000000000010";
        expectedOutput = 1;
    }

    @Test
    public void scenario8() {
        A = "00000000100110000000000010";
        expectedOutput = 3;
    }

    @Test
    public void scenario9() {
        A = "000000001001010000000000010";
        expectedOutput = 3;
    }

    @Test
    public void scenario10() {
        A = "0000000010010010000000000010";
        expectedOutput = 2;
    }

    @Test
    public void scenario11() {
        A = "00000000100010000000000000";
        expectedOutput = 2;
    }

    @Test
    public void scenario12() {
        A = "00000000100000000000000000";
        expectedOutput = 1;
    }

    @Test
    public void scenario13() {
        A = "00100000100000000000000000";
        expectedOutput = 2;
    }

    @Test
    public void scenario14() {
        A = "000000001000000000000000001";
        expectedOutput = 2;
    }

    @Test
    public void scenario15() {
        A = "110011";
        expectedOutput = 3;
    }

    @Test
    public void scenario16() {
        A = "000000";
        expectedOutput = 0;
    }
}