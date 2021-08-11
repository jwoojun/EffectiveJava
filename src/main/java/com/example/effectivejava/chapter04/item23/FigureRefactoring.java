package com.example.effectivejava.chapter04.item23;

public abstract class FigureRefactoring {
    abstract double area();
}

class Circle extends FigureRefactoring {
      final double radius;

      Circle(double radius) {
        this.radius = radius;
      }

      @Override
      double area() {
        return Math.PI * (radius * radius);
      }
}

class Rectangle extends FigureRefactoring {
      final double length;
      final double width;

      Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
      }

      @Override
      double area() {
        return length * width;
      }
}

class Square extends Rectangle {
      Square(double side) {
        super(side, side);
      }
}
