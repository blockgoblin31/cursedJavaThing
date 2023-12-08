package com.blockgoblin31.tester;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        time = System.currentTimeMillis();
        readFileAndReverseLines("src\\text.txt");
        System.out.println(System.currentTimeMillis() - time);
    }

    //a direct copy of what my overcomplicated code is doing except in a single method
    static void readFile() throws FileNotFoundException {
        ArrayList<String> input = new ArrayList<>();
        Scanner in = new Scanner(new File("src\\text.txt"));
        while (in.hasNext()) {
            input.add(in.nextLine());
        }
        ArrayList<String> output = new ArrayList<>();
        for (String s : input) {
            char[] chars = s.toCharArray();
            StringBuilder newString = new StringBuilder();
            for (int i = chars.length - 1; i > -1; i--) {
                newString.append(chars[i]);
            }
            output.add(newString.toString());
        }
        StringBuilder toPrint = new StringBuilder();
        for (String s : output) {
            toPrint.append(s);
            toPrint.append("\n");
        }
        toPrint.deleteCharAt(toPrint.length() - 1);
        System.out.println(toPrint);
    }

    //good code by milesman13
    public static void readFileAndReverseLines(String filePath) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader(filePath));

        for (String line : in.lines().toList()) {
            StringBuffer buf = new StringBuffer(line);
            buf.reverse();

            System.out.println(buf);
        }
    }
}
