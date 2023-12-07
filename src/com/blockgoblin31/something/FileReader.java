package com.blockgoblin31.something;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String> readFile(String path, FunctionPasser<String> loop) throws FileNotFoundException {
        Scanner in = new Scanner(new File(path));
        ArrayList<String> output = Iterator.whileLoop(in::hasNext, new FunctionPasser<>() {
            final ArrayList<String> output = new ArrayList<>();

            @Override
            public String get(String input) {
                return null;
            }

            @Override
            public ArrayList<String> getFinal(ArrayList<String> input) {
                return output;
            }

            @Override
            public Object get() {
                output.add(in.nextLine());
                return null;
            }
        });
        return Iterator.loop(output, loop);
    }
}
