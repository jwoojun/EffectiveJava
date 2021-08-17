package com.example.effectivejava.chapter06.item39;

public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void method1(){
        int i=0;
        i = i/i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void method2(){
        int [] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void method3(){};
}
