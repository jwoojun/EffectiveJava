package com.example.effectivejava.chapter07.item46;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println(Operation.stringToEnum.get("+"));
  }
}

enum Operation {
      PLUS("+", Double::sum),
      MINUS("-", (x, y) -> x - y),
      TIMES("*", (x, y) -> x * y),
      DIVIDE("/", (x, y) -> x / y);

      // 추가
      public static final Map<String, Operation> stringToEnum =
          Stream.of(values()).collect(toMap(Object::toString, o -> o));

      private final String symbol;
      private final DoubleBinaryOperator op;

      Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
      }

      @Override
      public String toString() {
        return symbol;
      }

      public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
      }
}
