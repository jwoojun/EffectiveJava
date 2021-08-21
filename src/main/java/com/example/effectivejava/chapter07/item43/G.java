package com.example.effectivejava.chapter07.item43;


interface G1{
    <E extends Exception> Object m() throws E;
}

interface G2{
    <F extends Exception> String m() throws Exception;
}

public interface G extends G1, G2{
//    <F extends Exception> ()->String throws F;
}
