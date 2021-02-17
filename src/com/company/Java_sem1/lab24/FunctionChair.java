package com.company.Java_sem1.lab24;

public class FunctionChair implements Chair {
    public FunctionChair() {
    }

    public void func(int a, int b){
        System.out.println(a * b);
    }
    @Override
    public void printChair() {
        System.out.println("Функцианальный стул");
    }
}
