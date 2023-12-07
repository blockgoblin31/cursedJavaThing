package com.blockgoblin31.something;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Iterator {
    public static <T> ArrayList<T> loop(Iterable<T> thing, FunctionPasser<T> func) {
        ArrayList<T> output = new ArrayList<>();
        for (T t : thing) {
            output.add(func.get(t));
        }
        return func.getFinal(output);
    }

    public static <T> ArrayList<T> whileLoop(Supplier<Boolean> condition, FunctionPasser<T> func) {
        ArrayList<T> output = new ArrayList<>();
        while (condition.get()) {
            func.get();
        }
        return func.getFinal(output);
    }
}
