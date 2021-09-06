package com.example.effectivejava.chapter07;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.LongStream;

public class Item48 {

    static long pi_v1(long n){
        return LongStream.rangeClosed(2, n)
                .mapToObj(BigDecimal::valueOf)
                .filter(i->i.toBigInteger().isProbablePrime(50))
                .count();
    }

    static long pi_v2(long n){
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigDecimal::valueOf)
                .filter(i->i.toBigInteger().isProbablePrime(50))
                .count();
    }



}
