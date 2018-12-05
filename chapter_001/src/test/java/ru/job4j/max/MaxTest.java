package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Stas Syrgashev
 * @version $Id$
 * @since 4.12.2018
 */
 public class MaxTest {
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
	
	@Test
	public void whenSecondLessFirst() {
		Max maxim = new Max();
		int result = maxim.max(2, 1);
		assertThat(result, is(2));
	}
	
	@Test
	public void whenFirstEqualsSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 1);
		assertThat(result, is(1));
	}
}
 