package com.example.effectivejava.chapter09.item63;

public class Item63 {

      int array[] = {1, 2, 3, 4, 5, 6};

      public String statement() {
        String result = "";
        for (int i = 0; i < array.length; i++) {
          result += array[i];
        }
        return result;
      }

      public String statement2() {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < array.length; i++) {
          builder.append(array[i]);
        }
        return builder.toString();
      }

      public static void main(String args []){
          Item63 item63 = new Item63();
          System.out.println(item63.statement2());
      }
}

