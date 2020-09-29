package com.company.lab7;

public class Test {public static void main(String []args) {
    Shelf shelf = new Shelf("полка","orange",3500);
    Table table = new Table("стол","green",5000);
    Bed bed = new Bed("кровать", "red", 40000);
    Chair chair = new Chair("стул","blue",2000);
    FurnitureShop furnitureShop = new FurnitureShop(shelf, table, bed, chair);
    Person person = new Person();
    person.addToCartShelf(furnitureShop.getShelf());
    person.addToCartTable(furnitureShop.getTable());
    person.addToCartBed(furnitureShop.getBed());
    person.addToCartChair(furnitureShop.getChair());
    person.displayCart();

}
}
