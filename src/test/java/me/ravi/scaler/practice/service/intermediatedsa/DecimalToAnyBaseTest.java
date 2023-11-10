package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DecimalToAnyBaseTest extends AbstractTest {
    @Autowired
    DecimalToAnyBase decimalToAnyBase;
    int A;
    int B;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, decimalToAnyBase.aDecimalToAnyBase(A, B));
    }

    @Test
    public void scenario1() {
        A = 21;
        B = 2;
        expectedOutput = 10101;
    }

    @Test
    public void scenario2() {
        A = 10;
        B = 2;
        expectedOutput = 1010;
    }

    @Test
    public void scenario3() {
        A = 8;
        B = 3;
        expectedOutput = 22;
    }

    @Test
    public void scenario4() {
        A = 109;
        B = 2;
        expectedOutput = 1101101;
    }
}