package com.company.lab7;
import java.util.Vector;

public class Person {
    private Vector <Bedroom> personVector ;
    public Person(){ personVector = new Vector<>();}
    public void addToCartShelf(Shelf shelf){

        personVector.addElement(shelf);
    }
    public void addToCartTable(Table table){

        personVector.addElement(table);
    }
    public void addToCartBed(Bed bed)
    {
        personVector.addElement(bed);
    }
    public void addToCartChair(Chair chair)
    {
        personVector.addElement(chair);
    }
    public void displayCart(){
        for(int i = 0; i< personVector.size();i++){
            System.out.println(personVector.get(i).toString());
        }

    }
}
