package com.example.effectivejava.chapter08.item52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {
      public static void main(String args[]) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> lst = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
          set.add(i);
          lst.add(i);
        }

        for (int i = 0; i < 3; i++) {
          set.remove(i);
          lst.remove((Integer) i);
        }

        System.out.println("Set= " + set + ", List= " + lst);
      }
}


