package com.example.effectivejava.chapter01.item1;


public class SingleTon {

      private static SingleTon instance = null;

      public static SingleTon getInstance() {
        if (instance == null) {
          synchronized (SingleTon.class) {
            if (instance == null) {
              instance = new SingleTon();
            }
          }
        }
        return instance;
      }
}
