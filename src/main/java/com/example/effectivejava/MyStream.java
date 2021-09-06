package com.example.effectivejava;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class MyStream <T> {
    private List<T> data;
    private T smallData;

    public MyStream(List<T> data) {
        this.data = data;
    }

    public MyStream(T smallData) {
        this.smallData = smallData;
    }

    public <R> MyStream<R> map(Function<? super T, ? extends R> transform){
        List<R> newData = new LinkedList<>();
        for(var item : data){
            R r = transform.apply(item);
            newData.add(r);
        }
        return new MyStream(newData);
    }

    public <R> MyStream<R> map_v2(Function<? super T, ? extends R> transform){
        return new MyStream<>(transform.apply(smallData));
    }

    public static void main(String[] args){
        MyStream<String> myStream = new MyStream("String");
        System.out.println(myStream.map_v2(String::length));
    }

    @Override
    public String toString() {
        return "MyStream{" +
                "data=" + data +
                ", smallData=" + smallData +
                '}';
    }
}

interface Function_V1<T, R>{ }

interface Function_V2<T> { }





//    public <R> MyStream<R> map3(Function<? super T, ? extends R> transform){
//        R aaply = transform.apply(smallData);
//        return new MyStream<>(aaply);
//    }


//    public static void main(String[] args){
//        List<String> lstA = List.of("A");
//        List<String> lstB = List.of("A");
//        System.out.println(lstA==lstB);
//        System.out.println(lstA.hashCode());
//        System.out.println(lstB.hashCode());
//        List<String> lst = List.of("Man", "Woman");
//        MyStream<String> myStream = new MyStream<>(lst);
//        System.out.println(myStream.map(String::length));
//
//        MyStream<String> myStream2 = new MyStream<>("String");
//        System.out.println(myStream2.map3(String::length));
//    }




