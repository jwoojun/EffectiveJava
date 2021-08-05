package com.example.effectivejava.chapter2.item17;

public class ComplexStatic {
      private final double re;
      private final double im;

      private ComplexStatic(double re, double im) {
        this.re = re;
        this.im = im;
      }

      public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
      }
}


