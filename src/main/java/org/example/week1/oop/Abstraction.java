package org.example.week1.oop;

abstract class Shape {
    private String color;
    private int count;

    public Shape(){}

    public Shape(String color) {
        this.color = color;
    }

    public Shape(String color, int count) {
        this.color = color;
        this.count = count;
    }

    abstract void draw();
    public abstract String toString();

    public String toStringMethod() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", count=" + count +
                '}';
    }
}

class Circle extends Shape {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color, int count, int radius) {
        super(color, count);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public String toString() {
        String superStr = super.toStringMethod();
        return "Circle{" +
                "radius=" + radius +
                "super=" + superStr +
                '}';
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public String toString() {
        return null;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Circle s1 = new Circle("Red", 3);
        Shape s2 = new Circle("Red", 2, 3);
        Shape s3 = new Rectangle();
        s1.draw();
        s1.toString();
        s2.draw();
        s3.draw();
    }
}
