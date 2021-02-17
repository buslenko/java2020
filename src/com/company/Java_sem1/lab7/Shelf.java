package com.company.Java_sem1.lab7;

public class Shelf extends Bedroom{
    public Shelf(String name, String color, double price){
        super(name, color, price);
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
