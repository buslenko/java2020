package com.company.Java_sem1.lab24;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Сидит на " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}