package com.company.dog;
import java.util.*;
import java.lang.String;

public class House {
    ArrayList <Dog> dogs = new ArrayList<Dog>();

    public void dogAdd(String name, int age){
        dogs.add(new Dog (name, age));
    }
    public void show(){
        System.out.println(dogs);
    }

}
