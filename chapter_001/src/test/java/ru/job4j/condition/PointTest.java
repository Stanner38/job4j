package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author me
 * @version 1
 * @since 15.11.2018
 */
public class PointTest {
    /**
     * Test point.
     */
    @Test
    public void calculateDistanceBetweenTwoPointsTest() {
        Point a = new Point(1, 1);
		Point b = new Point(2, 1);
        double expect = 1;
        double result = a.distanceTo(b);
        assertThat(result, is(expect));
    }
}