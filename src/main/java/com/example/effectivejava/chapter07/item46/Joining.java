package com.example.effectivejava.chapter07.item46;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Joining {

    public static void main(String args []){
        String[] word = new String[]{"a", "b", "c", "d"};
        String result = Arrays.stream(word)
                .collect(joining("."));

        String result2 = String.join(".", word);


        String[] words = new String[]{"a", "b", "c", "d"};
        String result3 = Arrays.stream(words)
                .collect(joining(",","[","]"));
        System.out.println(result3);
    }
}
