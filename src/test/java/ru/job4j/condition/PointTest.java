package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when12to22then1() {
        double expected = 1;
        Point a = new Point(1, 2);
        Point b = new Point(2, 2);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when48to44then4() {
        double expected = 4;
        Point a = new Point(4, 8);
        Point b = new Point(4, 4);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when48to48then0() {
        double expected = 0;
        Point a = new Point(4, 8);
        Point b = new Point(4, 8);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }
}