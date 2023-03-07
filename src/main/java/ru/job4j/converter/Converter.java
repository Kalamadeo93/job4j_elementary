package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float inForDollar = 180;
        float expectedForDollar = 3;
        float outForDollar = Converter.rubleToDollar(inForDollar);
        boolean checkOutForDollar = (outForDollar == expectedForDollar);
        System.out.println("140 rubles are 2 euro. Test result : " + (out == expected));
        System.out.println(checkOutForDollar ? "Test result : " + checkOutForDollar + "\n"
                + "180 rubles are " + outForDollar + " dollars" : "Test result : " + checkOutForDollar);
    }
}
