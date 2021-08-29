package com.example.effectivejava.chapter05.item29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.concurrent.DelayQueue;

public class Stack<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        @SuppressWarnings("unchecked") E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size){
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private static final String[] arguments = {"A", "B", "C", "D", "E"};

    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        for (String arg : arguments){
            stack.push(arg);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().toUpperCase());
        }
    }
}





