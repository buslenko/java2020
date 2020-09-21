package com.company.lab5;
import java.awt.*;
import java.sql.SQLOutput;

public abstract class Shape {
    String color;
    Object Shapes;

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
