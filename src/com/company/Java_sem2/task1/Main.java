package com.company.Java_sem2.task1;

public class Main {
    public static void main(String[] args) {
        int mass [] = new int []{1,2,3,4,5};


        FunctionalInterface<Integer> addition = x->a(mass);
        addition.getResult(mass);
    }

    public static void a (int mass []){
        for (int i=4;i>=0;i--){
            System.out.print(mass[i]);
        }

    }

}
