//package com.example.effectivejava.chapter01.item3;
//
//import java.util.ArrayList;
//import java.util.Dictionary;
//import java.util.List;
//import java.util.Objects;
//
//public class SpellChecker {
//    private static final KoreaDictionary dictionary = null;
////    private SpellChecker(){};
////    public static boolean isValid(String word) {
////            return dictionary.contain(word);
////    }
//
//    public SpellChecker(KoreaDictionary dictionary){
//        this.dictionary = Objects.requireNonNull(dictionary);
//    }
//}
//
//class KoreaDictionary{
//    private final List<String> words = new ArrayList<>();
//
//    public boolean contain(String word) {
//        return words.contains(word);
//    }
//
//}
//do {
//    flag[i]= true;
//    turn = j;
//    while(flag[j] && turn == j);
//    critical_section
//    flag[i]=false;
//    remainder_section
//}while(1);