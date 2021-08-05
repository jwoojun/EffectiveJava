package com.example.effectivejava.chapter2.item16;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class BigPoint{
    public double x;
    public double y;

    public static void main(String args []){
        BigPoint point = new BigPoint();

    }
}


class OuterPoint{

    public class InnerPoint{
        private double z;

    }

    public static void main(String args []){
        OuterPoint outerPoint = new OuterPoint();
        OuterPoint.InnerPoint innerPoint =  outerPoint.new InnerPoint();

    }

}





