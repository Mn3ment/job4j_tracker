package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        int expected = 4;
        Point a = new Point(8, 4);
        Point b = new Point(8, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void distance1() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0,2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void distance3d() {
        double expected = 2.24;
        Point a = new Point(0, 0, 3);
        Point b = new Point(0, 2, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void distance3d2() {
        double expected = 4.12;
        Point a = new Point(0, 2, 6);
        Point b = new Point(2, 4, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}