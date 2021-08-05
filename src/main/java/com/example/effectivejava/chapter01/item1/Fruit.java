package com.example.effectivejava.chapter01.item1;


public enum Fruit {
      APPLE("사과"), BANANA("바나나"),LEMON("레몬");
      private final String kind;

       Fruit(String kind) {
        this.kind = kind;
      }
}


