package ru.job4j.max;

/**
 * @author Stas Syrgashev
 * @version $Id$
 * @since 4.12.2018
 */
public class Max {
    /**
	method "max" calculates max of two or three numbers.
	*/   
    public int max(int first, int second) {
		return (first > second ? first : second);
	}
	public int max(int first, int second, int third) {
		int temp = this.max(this.max(first, second), third);
		return temp;
	}
}