package ru.job4j.calculator;

public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static int maxFromThree(int first, int second, int third) {
        int res = Math.max(first, second);
        res = Math.max(res, third);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println(maxFromThree(1, 3, 2));
    }
}

