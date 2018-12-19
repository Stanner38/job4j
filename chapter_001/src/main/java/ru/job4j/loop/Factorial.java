package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        if (n == 0) {
            return 1;
        }
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = factor * i;
        }
        return factor;
    }
}