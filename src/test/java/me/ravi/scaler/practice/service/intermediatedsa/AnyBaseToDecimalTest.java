package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AnyBaseToDecimalTest extends AbstractTest {
    @Autowired
    AnyBaseToDecimal anyBaseToDecimal;
    int expectedOutput;
    int A;
    int B;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, anyBaseToDecimal.solve(A, B));
    }

    @Test
    public void scenario1() {
        A = 10101;
        B = 2;
        expectedOutput = 21;
    }

    @Test
    public void scenario2() {
        A = 1010;
        B = 2;
        expectedOutput = 10;
    }

    @Test
    public void scenario3() {
        A = 22;
        B = 3;
        expectedOutput = 8;
    }

    @Test
    public void scenario4() {
        A = 1101101;
        B = 2;
        expectedOutput = 109;
    }
}