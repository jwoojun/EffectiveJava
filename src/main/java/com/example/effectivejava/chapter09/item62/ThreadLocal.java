package com.example.effectivejava.chapter09.item62;

import java.util.Iterator;
import java.util.List;



public class ThreadLocal {
    private ThreadLocal() { }

    // 현 스레드의 값을 키로 구분해 저장한다.
    public static void set(String key, Object value) {
        /**
         *  Logic
         * */
    }

    // 키가 가리키는 현 스레드의 값을 반환한다.
    public static Object get(String key) {
        /**
         *  Logic
         * */
        Object o = new Object();
        return o;
    }
}

//public final class ThreadLocal<T> {
//    private ThreadLocal() { }
//
//    public void set(T value){
//        /**
//         *  Logic
//         * */
//    };
//    public T get(){
//        /**
//         *  Logic
//         * */
//        Object o = new Object();
//        return (T) o;
//    };
//
//
//    public static void main(String args []){
//        String className = ThreadLocal.class.getName();
//        List<String> lst = List.of("A", "B", "C");
//        Iterator<String> i = lst.iterator();
//
//        String compoundKey = className + "#" + i.next();
//
//
//    }
//}