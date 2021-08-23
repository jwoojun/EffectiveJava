package com.example.effectivejava.chapter10.item77;

import java.time.LocalTime;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Item77 {
    ExecutorService executor
            = Executors.newSingleThreadExecutor();

    Future<Integer> future = executor.submit(() -> {
        System.out.println(LocalTime.now() + " Starting runnable");
        Integer sum = 1 + 1;
        Thread.sleep(3000);
        return sum;
    });


    public static void main(String args []){
        try{

        }catch (Exception e){

        }




    }
}
