package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else  {
                result = SimpleStringEncoder.assign(result, symbol, counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }

        result = SimpleStringEncoder.assign(result, symbol, counter);

        return result;
    }

    private static String assign(String result, char symbol, int counter) {
        result += (counter == 1) ? Character.toString(symbol) : Character.toString(symbol) + counter;
        return result;
    }
}

