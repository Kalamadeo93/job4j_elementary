package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        while (diff != 0) {
            for (int i : coins) {
                while (diff >= i) {
                    rsl[size] += i;
                    size++;
                    diff -= i;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
/*
while (diff - coins[i] >= 0) {
                    diff -= coins[i];
                    rsl[size] = coins[i];
                    size++;
                    break;
                }

 */