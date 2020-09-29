package com.company.lab7;

public class Table extends Bedroom{
    public Table(String name, String color, double price){
        super(name, color, price);
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
