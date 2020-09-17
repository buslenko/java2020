package com.company.lab3;
import java.lang.*;

public class Circle {
    public double radius;
    public double square;
    public double perimeter;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        square = Math.pow(radius, 2)*Math.PI;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        perimeter = 2*Math.PI*radius ;
    }
}
