package com.company.lab3;

public class HumanTest {
    public static void main(String[] args){
        Human human = new Human("Woman", "Sara", 28, 173, 57, new Head("red", "green"), new Leg(37), new Hand(5));
        System.out.println("Пол: " + human.getSex() + ", Имя: " + human.getName());
        System.out.println("Возраст: " + human.getAge() + ", Рост: " + human.getHeight() + " Вес: " + human.getWeight());
        System.out.println("Цвет волос: " + human.getHead().getHairColor() + ", Цвет глаз: " + human.getHead().getEyesColor() +", Размер ноги: " + human.getLeg().getSize() + ", Пальцев на руке: " + human.getHand().getFingers());

    }
}
