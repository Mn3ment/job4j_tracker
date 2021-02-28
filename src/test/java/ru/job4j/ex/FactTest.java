package ru.job4j.ex;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calc() {
        int rsl = Fact.calc(-5);
        assertThat(rsl,is("number should be more then 0."));
    }

    @Test
    public void When5To120() {
        int rsl = Fact.calc(5);
        assertThat(rsl,is(120));
    }
}