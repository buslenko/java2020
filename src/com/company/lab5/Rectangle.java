package com.company.lab5;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public  Rectangle(String color, double height, double width){
        super(color);
        this.height=height;
        this.width=width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "color=" + color +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
