package ru.job4j.array;

/**
 * Проверка массива на однородность.
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            result = (data[i] == data [i + 1]);
        }
        return result;
    }
}