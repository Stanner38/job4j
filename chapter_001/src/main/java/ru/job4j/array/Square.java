package ru.job4j.array;

/**
 * заполнение массива квадратами чисел
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int number = 1; number <= bound; number++) {
        rst[number - 1] = number * number;
        }
        return rst;
    }
}