package com.example.effectivejava.chapter01.item2;

import java.time.LocalDate;
import java.util.*;

public class Naver extends PayTypeService{

    protected Naver createInstance(){
        Naver naver = new Naver();
        return naver;
    }

    public static Naver createNaevr_second(){
        Naver naver = new Naver();
        return naver;
    }

    public static void main(String args []){

        List<String> lst = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        Collection a = new ArrayList();
        a.add("String");
        System.out.println(a.size());

        EnumSet<Color> enumSet = EnumSet.noneOf(Color.class);
        Boolean valueOf = Boolean.valueOf("True");



    }
}
enum Color {
    RED, YELLOW, GREEN, BLUE, BLACK, WHITE
}