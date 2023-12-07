package com.blockgoblin31.tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        long time = System.currentTimeMillis();
        readFile();
        long difference = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        com.blockgoblin31.something.Main.main(args);
        long secondDifference = System.currentTimeMillis() - time;
        System.out.println(difference);
        System.out.println(secondDifference);
        System.out.println(secondDifference - difference);
    }

    static void readFile() throws FileNotFoundException {
        ArrayList<String> output = new ArrayList<>();
        Scanner in = new Scanner(new File("src\\text.txt"));
        while (in.hasNext()) {
            output.add(in.nextLine());
        }
        for (String s : output) {
            char[] chars = s.toCharArray();
            StringBuilder newString = new StringBuilder();
            for (char c : chars) {
                newString.insert(0, c);
            }
            System.out.println(newString.toString());
        }
    }
}
