package com.blockgoblin31.something;

import java.util.ArrayList;

public class PrimitiveFixer {
    public static ArrayList<Character> charToCharacter(char[] chars) {
        ArrayList<Character> out = new ArrayList<>();
        for (char c : chars) {
            out.add(c);
        }
        return out;
    }
}
