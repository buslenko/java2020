package com.company.Java_sem1.lab5;



public class Main {

    public static void main(String[] args){

        Shape rect = new Rectangle("blue", 100, 150 );
        Shape square = new Square("orange", 30);
        Shape circle = new Circle("rad", 10);
        System.out.println(square);
        System.out.println(rect);
        System.out.println(circle);

    }

}