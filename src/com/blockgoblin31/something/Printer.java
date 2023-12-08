package com.blockgoblin31.something;

import java.util.ArrayList;

public class Printer {
    public static void print(String text) {
        System.out.println(text);
    }
    public static void print(ArrayList<String> lines) {
        System.out.println(StringHelper.joinStrings(lines));
    }
}
