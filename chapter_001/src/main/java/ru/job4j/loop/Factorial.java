package ru.job4j.loop;

/**
 * @author Stas Syrgashev.
 * @version 1.
 * @since 15.01.2019.
 */
public class Factorial {
    /**
     * @param n число, для которого вычисляется факториал.
     * @return значение факториала.
     */
    public int calc(int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = factor * i;
        }
        return factor;
    }
}
