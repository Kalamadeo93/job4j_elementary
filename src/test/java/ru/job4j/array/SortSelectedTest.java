package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Nums() {
        int[] data = new int[] {6, 4, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 6, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Nums() {
        int[] data = new int[] {5, 15, 8, 1, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 7, 8, 15};
        assertThat(result).containsExactly(expected);
    }
}