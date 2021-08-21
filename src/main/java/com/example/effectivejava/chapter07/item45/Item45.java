package com.example.effectivejava.chapter07.item45;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Item45 {

//    private static List<Card> newDeck(){
//        List<Card> result = new ArrayList<>();
//        for()
//    }

    public static void main(String args []){
        // 함수 객체
        Predicate<String> functionObject = x->x.equals("A");
        Stream.of("A", "B", "C", "D")
                .filter(functionObject)
                .collect(toList());

        // 반복 코드
        int result = 0;
        for(int i=0; i<10; i++){
            result++;
        }


        String sentence = "Hello World, Java";
        sentence.chars().forEach(System.out::print);
        System.out.println();
        sentence.chars().forEach(x -> System.out.print((char) x));
    }
}

