package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Stas Syrgashev.
 * @version 1.
 * @since 18.12.2018.
 */
public class CounterTest {
    @Test
    public void whenStartFromOneToTen() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }
}
