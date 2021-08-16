package com.example.effectivejava.chapter08.item52;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Item52 {
      public static void main(String args[]) {

            // Thread의 생성자 호출
            new Thread((System.out::println));

            // ExecutorService의 submit 메서드 호출
            ExecutorService exec = Executors.newCachedThreadPool();
            // exec.submit(System.out::println);

      }
}
