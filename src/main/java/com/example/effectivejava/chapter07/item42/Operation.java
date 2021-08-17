package com.example.effectivejava.chapter07.item42;

public enum Operation {
      PLUST("+") {
        public double apply(double x, double y) {
          return x + y;
        }
      },
      MINUS("-") {
        public double apply(double x, double y) {
          return x - y;
        }
      },
      TIMES("*") {
        public double apply(double x, double y) {
          return x * y;
        }
      },
      DIVIDE("/") {
        public double apply(double x, double y) {
          return x / y;
        }
      };

      private final String symbol;

      Operation(String symbol) {
        this.symbol = symbol;
      }

      @Override
      public String toString() {
        return "Operation{" + "symbol='" + symbol + '\'' + '}';
      }
  ;
}
