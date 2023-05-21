package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result += symbol;
                result += counter;
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        return result;
    }
}
//"aaaabbbccd"
//"a4b3c2d";