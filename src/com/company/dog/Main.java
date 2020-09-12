package com.company.dog;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int age;
        String name;
        Scanner scan = new Scanner(System.in);
        House dog = new House();
        name = scan.nextLine();
        while (!(name. equals ( " стоп " ))) {
            age = scan.nextInt();
            Dog dogs = new Dog(name, age);
            System.out.println(dogs.ageDog(age));
            System.out.println(dogs.toString());
            dog.dogAdd(name, age);
            name=scan.nextLine();
        }
        dog.show();
    }

}
