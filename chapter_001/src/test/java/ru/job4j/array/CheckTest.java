package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataEven() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotEven() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}