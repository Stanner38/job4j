package ru.job4j.calculator;

/**
 * Class for calculator.
 * @author Stanis.
 * @version 1.
 * @since 02.10.2018.
 */

public class Calculator {
    /**
     * variable of result.
     */
    private double result;

    /**
     * Method "add"  calculates a sum of two numbers.
     * @param first first input number.
     * @param second second input number.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method "subtract"  calculates a subtraction of two numbers.
     * @param first first input number.
     * @param second second input number.
     */
	public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method "div"  calculates a dividing of two numbers.
     * @param first first input number.
     * @param second second input number.
     */
	public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method "multiple"  calculates a multiplying of two numbers.
     * @param first first input number.
     * @param second second input number.
     */
	public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     *
     * @return result of arithmetic operation.
     */
    public double getResult() {
        return this.result;
    }
}
  