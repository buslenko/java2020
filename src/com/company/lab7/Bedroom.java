package com.company.lab7;

public abstract class Bedroom {
    String name;
    String color;
    double price;
    public Bedroom(String name, String color, double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //public abstract void setBedroom(String name, String color, double price);

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
