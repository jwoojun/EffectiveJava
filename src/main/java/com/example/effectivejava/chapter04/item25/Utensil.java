package com.example.effectivejava.chapter04.item25;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Utensil {
    static final String NAME= "pan";
}

class Dessert{
    static final String NAME = "cake";
    public static void main(String args []){
        BigDecimal a = BigDecimal.ZERO;
        for(int i=0; i<5; i++){
            a = BigDecimal.TEN.add(a);
        }
    System.out.println(a);
    }
}

class DefensiveCopy {
      public static void main(String args[]) {
        List<String> lst = new ArrayList<>();
        lst.add("A");
        lst.add("B");
        lst.add("C");

        List<String> copyOf = List.copyOf(lst);
        lst.add("D");

        System.out.println("lst= " + lst);
        System.out.println("copyOf= " + copyOf);



//                unmodify.add("A");



          List<String> unmodify = Collections.unmodifiableList(new ArrayList<>(lst));
        List<String> safetyCopy = new ArrayList<>(lst);
        safetyCopy.add("D");
        lst.remove("A");

        System.out.println(lst);
        System.out.println(safetyCopy);

      }

      private enum DeliveryType{
          COUPANG{
              @Override
              void test(){

              }
          };
          abstract void test();
      }
}


