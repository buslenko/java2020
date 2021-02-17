package com.company.Java_sem1.lab5;

public abstract class Shape {
    String color;

    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "color='" + color + '\'' +
                '}';
    }
}
