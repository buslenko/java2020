package com.company.lab5;

public class Circle extends Shape{

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + color +
                ", diameter=" + radius*2 +
                '}';
    }
}

