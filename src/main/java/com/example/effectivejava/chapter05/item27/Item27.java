package com.example.effectivejava.chapter05.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Item27 {
    int size = 30;
    Object [] elements = {1,2,3};

  Set<Lark> exaltation = new HashSet<>();

      public <T> T[] toArray(T[] a) {
        if (a.length < size) {
          T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
          return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) a[size] = null;
        return a;
      }


    }

class Lark {}
