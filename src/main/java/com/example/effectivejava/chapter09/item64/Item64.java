package com.example.effectivejava.chapter09.item64;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Item64 {
    public static void main(String args []){
        Set<String> exampleA = new LinkedHashSet<>();            // 올바른 방법
        LinkedHashSet<String> exampleB = new LinkedHashSet<>();  // 옯바르지 않은 방법

        Set<String> exampleC = new HashSet<>();
    }
}




