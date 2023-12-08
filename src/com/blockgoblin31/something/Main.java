package com.blockgoblin31.something;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> lines = FileReader.readFile("src\\text.txt", new FunctionPasser<>() {
            @Override
            public String get(String input) {
                return input;
            }

            @Override
            public ArrayList<String> getFinal(ArrayList<String> input) {
                return input;
            }

            @Override
            public Object get() {
                return null;
            }
        });
        ArrayList<String> reversedLines = Iterator.loop(lines, new FunctionPasser<>() {
            @Override
            public String get(String input) {
                return StringHelper.reverseString(input);
            }

            @Override
            public ArrayList<String> getFinal(ArrayList<String> input) {
                return input;
            }

            @Override
            public Object get() {
                return null;
            }
        });
        Printer.print(reversedLines);
    }
}