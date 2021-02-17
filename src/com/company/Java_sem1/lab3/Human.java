package com.company.Java_sem1.lab3;

public class Human {
    private String sex;
    private String name;
    private int age;
    private double height;
    private double weight;
    private Head head;
    private Leg leg;
    private Hand hand;


    public Human( String sex, String name, int age, double height, double weight, Head head, Leg leg, Hand hand){
        this.sex= sex;
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.head=head;
        this.leg=leg;
        this.hand=hand;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
