package com.blockgoblin31.something;

import java.util.ArrayList;

public class StringHelper {
    public static String joinStrings(ArrayList<String> strings) {
        FunctionPasser<String> func = new FunctionPasser<>() {
            final StringBuilder result = new StringBuilder();

            @Override
            public String get(String input) {
                result.append(input);
                result.append("\n");
                return input;
            }

            @Override
            public ArrayList<String> getFinal(ArrayList<String> input) {
                result.deleteCharAt(result.length() - 1);
                return input;
            }

            @Override
            public Object get() {
                return result.toString();
            }
        };
        Iterator.loop(strings, func);
        return (String) func.get();
    }
}
