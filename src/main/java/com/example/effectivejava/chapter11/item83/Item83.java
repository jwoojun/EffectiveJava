package com.example.effectivejava.chapter11.item83;

public class Item83 {

//    private final FieldType field = computeFieldValue();
    public static void main(String args []){

    }
}
class FieldType {
}

class Initialization {
    private static FieldType computeFieldValue() {
        return new FieldType();
    }
}