package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeft12Right5Up8Then12() {
        int left = 12;
        int right = 5;
        int up = 8;
        int result = Max.max(left, right, up);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeft2Right4Up5Down8Then8() {
        int left = 2;
        int right = 4;
        int up = 5;
        int down = 8;
        int result = Max.max(left, right, up, down);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}