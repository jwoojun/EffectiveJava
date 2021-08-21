package com.example.effectivejava.chapter05.item26;

import com.example.effectivejava.chapter06.item39.Sample;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class Stamp {
    private String name;
    private String serialNumber;
    private LocalDateTime createdAt;

    public Stamp(String name, String serialNumber, LocalDateTime createdAt) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.createdAt = createdAt;
    }

    public void Cancel() {
        System.out.println("Cancel");
    }

    static int numElementsInCommon(Set<?> set1, Set<?> set2){
        int result = 0;
        for(Object obj : set1){
            if(set2.contains(obj)){
                result++;
            }
        }
        return result;
    }


}


class Coin{
    private BigDecimal cost;

    public Coin(BigDecimal cost) {
        this.cost = cost;
    }
}


class StampMain{
    private static final Collection<Stamp> stmps = new ArrayList();
    private static final Collection<?> collection = new ArrayList<>();

    public static void main(String args []){
//        stmps.add(new Coin(new BigDecimal("1000")));
        for(Iterator i=stmps.iterator(); i.hasNext();){
            Stamp stamp = (Stamp) i.next();
            stamp.Cancel();
        }

        collection.add(null);
//        collection.add("A");
//        collection.add(new Coin("30000"));


        // 올바른 로 타입
        Class<List> listClass = List.class;
        Class<String[]> aClass = String[].class;
        Class<Integer> integerClass = int.class;

        // 올바르지 않은 로 타입
//        List<String>.class;
//        List<?>.class;



    }
}

