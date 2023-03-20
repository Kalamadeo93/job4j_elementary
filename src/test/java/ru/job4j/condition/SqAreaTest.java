package ru.job4j.condition;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K1Square1() {
        double expected = 1.5625;
        int p = 5;
        double k = 1;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K4Square1() {
        double expected = 1.44;
        int p = 6;
        double k = 4;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K1Square6() {
        double expected = 6.25;
        int p = 10;
        double k = 1;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }
}
