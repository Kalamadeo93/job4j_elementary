package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i + 1)) {
                symbol = input.charAt(i + 1);
                counter++;
                result += input.charAt(i);
            }
        }
        return result;
    }
}
//"aaaabbbccd"
//"a4b3c2d";