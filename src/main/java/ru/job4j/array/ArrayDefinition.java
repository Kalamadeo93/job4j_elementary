package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[10];
        float[] prices = new float[10];
        String[] names = new String[4];
        names[0] = "Andrey Belyakov";
        names[1] = "Vasiliy Pupkin";
        names[2] = "Evgeniy Fedorov";
        names[3] = "Anton Evimov";
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
