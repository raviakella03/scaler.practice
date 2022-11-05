package me.ravi.scaler.practice.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@Slf4j
class LittlePonnyAndMobilePhonesTest {

    @Autowired
    LittlePonnyAndMobilePhones littlePonnyAndMobilePhones;

    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();
    ArrayList<Integer> expectedOutput = new ArrayList<>();
    ArrayList<Integer> actualOutput = new ArrayList<>();

    @BeforeEach
    public void clearData() {
        A.clear();
        B.clear();
        expectedOutput.clear();
        actualOutput.clear();
    }

    @AfterEach
    public void testOutput() {
        if (expectedOutput.size() != actualOutput.size()) {
            fail("Different sizes");
        }

        for (int i = 0; i < expectedOutput.size(); i++) {
            if (expectedOutput.get(i) != actualOutput.get(i)) {
                log.info("Expected output: {}, Actual output: {}", expectedOutput.toString(), actualOutput.toString());
                fail("Output differs");
            }
        }
    }

    @Test
    public void scenario1() {
        A.add(3);
        A.add(4);
        A.add(4);
        A.add(6);

        B.add(20);
        B.add(4);
        B.add(10);
        B.add(2);

        expectedOutput.add(4);
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add(0);

        actualOutput = littlePonnyAndMobilePhones.solve(A, B);
    }
}