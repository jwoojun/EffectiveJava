package com.example.effectivejava.chapter08.item55;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Item55 {
    public static <E extends Comparable<E>> Optional<E> optionalMax(Collection<E> c){
        if(c.isEmpty()){
            return Optional.empty();
        }
        E result = null;
        for(E e : c){
            if(result==null || e.compareTo(result)>0){
                result = Objects.requireNonNull(e);
            }
        }
        return Optional.ofNullable(result);
    }

      public static <E extends Comparable<E>> Optional<E> streamMax(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
      }

      public List<String> alpha(String a) {
        List<Optional<String>> lst = List.of(Optional.ofNullable("A"));
        return lst.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
      }


    public String orElse(String a) {
        return Optional.ofNullable(a).orElse("A");
    }

    public String orElseGet(String a) {
        return Optional.ofNullable(a).orElseGet(()->"A");
    }

    public String orElseThrow(String a) {
        return Optional.ofNullable(a).orElseThrow();
    }



      public static List<String> alphaFlatMap() {
        List<Optional<String>> lst = List.of(Optional.ofNullable("A"));
        return lst.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
      }

    public static void main(String args []){
        alphaFlatMap().forEach(System.out::println);

    }



}

//    public static <E extends Comparable<E>> E max(Collection<E> c){
//        if(c.isEmpty()){
//            throw new IllegalArgumentException("Empty Collection.");
//        }
//        E result = null;
//        for(E e : c){
//            if(result==null || e.compareTo(result)>0){
//                result = Objects.requireNonNull(e);
//            }
//        }
//        return result;
//    }