package com.example.effectivejava.chapter08.item53;

import java.util.EnumSet;

public class Item53 {
      static int sum(int... args) {
        int sum = 0;
        for (int arg : args) {
          sum += arg;
        }
        return sum;
      }

      static int min(int... args) {
        if (args.length == 0) {
          throw new IllegalArgumentException("인수가 1개 이상 필요합니다.");
        }
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
          if (args[i] < min) {
            min = args[i];
          }
        }
        return min;
      }

      static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs) {
          if (arg < min) {
            min = arg;
          }
        }
        return min;
      }


      public void foo() {};
      public void foo(int value1) {};
      public void foo(int value1, int value2) {};
      public void foo(int value1, int value2, int value3) {};
      public void foo(int value1, int value2, int value3, int value4) {};
      public void foo(int value1, int value2, int value3, int value4, int... rest) {};




}

