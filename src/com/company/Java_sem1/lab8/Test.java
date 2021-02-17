package com.company.Java_sem1.lab8;

import java.awt.*;
import java.util.Random;

public class Test  {
    public static void main(String[] args) {
        com.company.Java_sem1.lab8.Shape[]shapes=new Shape[20];
        Random rand=new Random();
        Color randomColor;
        int randTip;
        for(int i=0;i<20;++i){
            randTip=rand.nextInt(3)+1;
            switch (randTip){
                case 1:
                    randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                    shapes[i]=new Rectangle(randomColor,100,50,rand.nextInt(500),rand.nextInt(500));
                    break;
                case 2:
                    randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                    shapes[i]=new Circle(randomColor,60,rand.nextInt(500),rand.nextInt(500));
                    break;
                case 3:
                    randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                    shapes[i]=new Triangle(randomColor,rand.nextInt(500),rand.nextInt(500));
                    break;
            }
        }
        Window app=new Window(shapes);
    }
}