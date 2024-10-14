package org.example;

import java.util.Map;

public class App {
    public String getGreeting() {
        return "NATO translator";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(getNATOCall('H'));
    }

    private static final String[] natoCalls = {
            "Alpha", "Bravo", "Charlie", "Delta", "Echo",
            "Foxtrot", "Golf", "Hotel", "India", "Juliett",
            "Kilo", "Lima", "Mike", "November", "Oscar",
            "Papa", "Quebec", "Romeo", "Sierra", "Tango",
            "Uniform", "Victor", "Whiskey", "Xray",
            "Yankee", "Zulu"
    };

    private static final Map<Character, String> natoSymbols = Map.of(
            '.', "Stop",
            ',', "Comma",
            '-', "Hyphen",
            '/', "Slant",
            '(', "Brackets on",
            ')', "Brackets off",
            ':', "Colon",
            ';', "Semi-colon",
            '!', "Exclamation mark",
            '?', "Question mark"
    );

    private static final String[] numberCalls = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
    };

    public static String getNATOCall(char letter) {
        if (letter >= 'a' && letter <= 'z') {
            return natoCalls[letter - 'a'];
        }
        if (letter >= 'A' && letter <= 'Z') {
            return natoCalls[letter - 'A'];
        }
        if (letter >= '0' && letter <= '9') {
            return numberCalls[letter - '0'];
        }
        if (natoSymbols.containsKey(letter)) {
            return natoSymbols.get(letter);
        }
        return null;
    }
}
