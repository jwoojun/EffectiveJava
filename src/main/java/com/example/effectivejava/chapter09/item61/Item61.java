package com.example.effectivejava.chapter09.item61;

import java.util.Comparator;

public class Item61 {
      public static Comparator<Integer> naturalOrder(Integer number1, Integer number2) {
        return (x, y) -> (number1 < number2) ? -1 : (x == y ? 0 : 1);
      }

      public static void main(String args[]) {
        System.out.println(naturalOrder(new Integer(42), new Integer(42)));
      }
}
