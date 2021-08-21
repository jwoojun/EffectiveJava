package com.example.effectivejava.chapter07.item45;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class Anagrams {
    public static void main(String args []) throws FileNotFoundException {
        File dictionary = new File("");
        int minGroupSize = Integer.parseInt("");

        Map<String, Set<String>> groups = new HashMap<>();
        try(Scanner s = new Scanner(dictionary)){
            while(s.hasNext()){
                String word = s.next();
//                groups.computeIfAbsent()
            }
        }


        Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime)
                .map(p -> BigInteger.TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(10)
                .forEach(mp -> System.out.println(mp.bitLength() + ": " + mp));



    }

    private static String alphabetize(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }


    static Stream<BigInteger> primes() {
        return Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
    }

}
