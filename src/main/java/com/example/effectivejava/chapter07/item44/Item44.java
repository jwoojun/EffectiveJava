package com.example.effectivejava.chapter07.item44;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Item44 {
    static Predicate<String> isEqualTo = x->x.equals("Example");
    static Consumer<String>  print = System.out::println;



}
