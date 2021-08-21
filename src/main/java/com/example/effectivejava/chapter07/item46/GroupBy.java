package com.example.effectivejava.chapter07.item46;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GroupBy {
    public static void main(String args []){
        String[] word = new String[]{"a", "cba", "b", "bcd", "e", "cbd", "def", "edf", "fed"};

        Map<Integer, List<String>> result =
            Arrays.stream(word).collect(groupingBy(String::length, Collectors.toList()));
        System.out.println(result);
  }
}
