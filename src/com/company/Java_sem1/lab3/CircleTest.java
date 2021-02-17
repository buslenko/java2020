package com.company.Java_sem1.lab3;
import java.util.*;

public class CircleTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle cir = new Circle();
        cir.setSquare(radius);
        cir.setPerimeter(radius);
        System.out.println(cir.getSquare());
        System.out.println(cir.getPerimeter());
    }

}
