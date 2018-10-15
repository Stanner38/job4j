package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value/76;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value/66;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int EuroToRuble(int value) {
        return value*76;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли
     */
    public int DollarToRuble(int value) {
        return value*66;
    }
}
