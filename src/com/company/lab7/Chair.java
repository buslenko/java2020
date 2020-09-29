package com.company.lab7;

public class Chair extends Bedroom{
    public Chair(String name, String color, double price){
        super(name, color, price);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
