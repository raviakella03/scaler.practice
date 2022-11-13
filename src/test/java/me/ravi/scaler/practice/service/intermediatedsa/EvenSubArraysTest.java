package me.ravi.scaler.practice.service.intermediatedsa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EvenSubArraysTest {

    private ArrayList<Integer> A;
    private String expectedOutput;
    @Autowired
    private EvenSubArrays evenSubArrays;

    @AfterEach
    public void checkOutput() {
        assertEquals(expectedOutput, evenSubArrays.solve(A));
    }

    @Test
    public void scenario1() {
        A = new ArrayList<>(Arrays.asList(978, 847, 95, 729, 778, 586, 188, 782, 813, 870, 871, 940, 312, 693, 580, 101, 760, 837, 564, 633, 680, 155, 241, 374, 682, 290, 850, 601, 433, 922, 773, 959, 530, 290, 990, 50, 516, 409, 868, 131, 664, 851, 721, 880, 20, 450, 745, 387, 787, 823, 392, 242, 674, 347, 65, 135, 819, 324, 651, 678, 139, 940));
        expectedOutput = "YES";
    }

    @Test
    public void scenario2() {
        A = new ArrayList<>(Arrays.asList(654, 50, 694, 750, 712, 275, 736, 146, 279, 816, 707, 396, 406, 589, 370, 742, 840, 290, 505, 23, 249, 447, 618, 80, 968, 189, 600, 662, 91, 604, 575, 689, 72, 196, 475, 198, 850, 844, 361, 419, 617, 911, 268, 628, 408, 404, 477, 921, 478, 806, 204, 637, 403, 911, 589, 529, 867, 584, 768, 257, 437, 380, 698, 452, 368, 97, 977, 582, 775, 103));
        expectedOutput = "NO";
    }

    @Test
    public void scenario3() {
        A = new ArrayList<>(Arrays.asList(2, 4, 8, 6));
        expectedOutput = "YES";
    }

    @Test
    public void scenario4() {
        A = new ArrayList<>(Arrays.asList(2, 4, 8, 7, 6));
        expectedOutput = "NO";
    }
}