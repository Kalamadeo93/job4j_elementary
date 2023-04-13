package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap6to7() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int source = 6;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11, 12, 13, 14};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int source = 3;
        int dest = 9;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 10, 5, 6, 7, 8, 9, 4, 11, 12, 13, 14};
        assertThat(result).containsExactly(expected);
    }
}