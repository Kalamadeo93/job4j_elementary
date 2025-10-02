package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int up) {
        return left + up > right ? left + up : right;
    }

    public static int max(int left, int right, int up, int down) {
        return left + up > right + down ? left + up : right + down;
    }
}
