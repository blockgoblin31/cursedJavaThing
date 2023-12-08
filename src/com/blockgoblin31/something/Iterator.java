package com.blockgoblin31.something;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Iterator {

    public static <T> ArrayList<T> loop(ArrayList<T> thing, FunctionPasser<T> func) {
        ArrayList<T> output = new ArrayList<>();
        loop(thing, func, output, 0, thing.size());
        return func.getFinal(output);
    }

    public static <T> ArrayList<T> loop(ArrayList<T> thing, FunctionPasser<T> func, ArrayList<T> output, int curNum, int endNum) {
        if (curNum >= endNum) return output;
        output.add(func.get(thing.get(curNum)));
        return loop(thing, func, output, curNum + 1, endNum);
    }

    public static <T> ArrayList<T> whileLoop(Supplier<Boolean> condition, FunctionPasser<T> func) {
        ArrayList<T> output = new ArrayList<>();
        whileLoop(condition, func, output);
        return func.getFinal(output);
    }

    static <T> ArrayList<T> whileLoop(Supplier<Boolean> condition, FunctionPasser<T> func, ArrayList<T> output) {
        if (!condition.get()) return output;
        func.get();
        return whileLoop(condition, func, output);
    }
}
