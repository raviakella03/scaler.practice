package me.ravi.scaler.practice.serviceimpl;

import me.ravi.scaler.practice.service.SimpleRecursion;
import org.springframework.stereotype.Service;

@Service
public class SimpleRecursionImpl implements SimpleRecursion {

    @Override
    public int solve(int A, int B) {
        return foo(A, B);
    }

    private int bar(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (x + bar(x, y-1));
    }

    private int foo(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return bar(x, foo(x, y-1));
    }
}
