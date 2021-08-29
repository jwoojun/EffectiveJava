package com.example.effectivejava.chapter09.item68;

public class Item69 {
    private final static int SPEED_LIMIT = 100;
    public static void main(String args []){
        Car car = new Car();


        if (car.speed() > 2 * SPEED_LIMIT){
            generatedAudibleAlert("경찰 조심하세요");
        }

    }

    public static void generatedAudibleAlert(String message){
        System.out.println(message);
    }
}


class Car{
    private int spped;


    public int speed() {
        return spped;
    }

    public void setSpped(int spped) {
        this.spped = spped;
    }
}