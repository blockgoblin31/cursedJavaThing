package com.blockgoblin31.something;

import java.util.ArrayList;

public interface FunctionPasser<T> {
    T get(T input);

    ArrayList<T> getFinal(ArrayList<T> input);

    Object get();
}
