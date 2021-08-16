package com.example.effectivejava.chapter08.item52;

import java.io.ObjectOutputStream;
import java.util.List;

public class Wine {
      String name() {
        return "포도주";
      }
}

class SparklingWine extends Wine {

      @Override
      String name() {
        return "발효성 포도주";
      }
}

class Champagne extends SparklingWine {

      @Override
      String name() {
        return "샴페인";
      }

      public static void main(String args[]) {
        List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());
        for (Wine wine : wineList) {
          System.out.println(wine.name());
        }
      }
}
