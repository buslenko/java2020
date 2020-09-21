package com.company.lab5;

public class Square extends Shape {
    private double size;

    public Square(String color, double size){
        super(color);
        this.size=size;
    }

    @Override
    public String toString() {
        return "Square{" + "color=" + color +
                ", size=" + size +
                '}';
    }
}
