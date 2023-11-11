package me.ravi.scaler.practice.service.intermediatedsa;

import me.ravi.scaler.practice.utils.AbstractTest;
import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UnsetABitTest extends AbstractTest {

    @Autowired
    UnsetABit unsetABit;
    int A;
    int B;
    int expectedOutput;

    /**
     *
     */
    @Override
    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, unsetABit.solve(A, B));
    }
}