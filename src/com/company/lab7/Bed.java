package com.company.lab7;

public class Bed extends Bedroom{
    public Bed(String name, String color, double price){
        super(name, color, price);
    }

    @Override
    public String toString() {
        return "Bed{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
