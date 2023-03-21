package ru.job4j.condition;

public class PointEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        /**
          @deprecated не разобрался, какой должен быть результат работы программы, что конкретно она должна сверить,
         * факт того, что обе части true или достаточно чтобы true была одна часть, если нужно равенство обеих частей
         * выражения, знак меняется на &&.
         */
        return (x1 == x2) || (y1 == y2);
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
    }
}
