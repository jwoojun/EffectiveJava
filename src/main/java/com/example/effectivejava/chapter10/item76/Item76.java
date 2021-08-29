package com.example.effectivejava.chapter10.item76;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;

public class Item76 {
    int size;
    Objects[] elements;

    public Object pop() {
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }
}

