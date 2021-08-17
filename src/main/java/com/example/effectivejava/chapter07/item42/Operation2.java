package com.example.effectivejava.chapter07.item42;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public enum Operation2 {
      PLUST("+", Double::sum),
      MINUS("-", (x, y) -> x - y),
      TIMES("*", (x, y) -> x * y),
      DIVIDE("/", (x, y) -> x / y);

      private final String symbol;
      private final DoubleBinaryOperator op;

      Operation2(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
      }

      @Override
      public String toString() {
        return "Operation2{" + "symbol='" + symbol + '\'' + ", op=" + op + '}';
      }

      public double apply(double x, double y){
          return op.applyAsDouble(x, y);
      }

      public static void main(String args []){
          IntStream a = new Random().ints(5,0,11).distinct();
          a.mapToObj(LottoNumber::new)
                          .collect(Collectors.toList());



          a.forEach(System.out::println);
//          ThreadLocalRandom.current().ints(0, 100).distinct().limit(5);


      }
}
class LottoNumber{
    int number;

    public LottoNumber(Integer number) {
        this.number = number;
    }
}

