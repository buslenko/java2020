package com.company.lab6;

import com.company.lab6.MovableCircle;
import com.company.lab6.MovableRectangle;

public class Main {
    public static void main(String[] args) {
        MovableCircle ci = new MovableCircle(88);
        MovableRectangle rectangle = new MovableRectangle(14, 35);
        ci.setCoords(5, 21);
        ci.move(55, 1);
        ci.allInfo();
        rectangle.setCoords(15, 210);
        rectangle.move(550, 10);
        rectangle.allInfo();
    }
}
