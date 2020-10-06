package com.company.lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame {

    private static Random random = new Random();
    public static int x = 20;
    public static int y = 50;

    public static Color colorRandom(){
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r,g,b);
    }

    public com.company.lab8.Shapes paintShape()
    {
        Color color = colorRandom();
        int nx = x;
        int ny = y;
        if (x + 100 <= 1000 - 100){
            x += 75;
        } else {
            x = 10;
            y += 100;
        }
        int width = random.nextInt(50) + 50;
        int height = random.nextInt(50) + 25;
        switch (random.nextInt(2)){
            case 0:
                return new Circle(color, nx, ny,  width / 2);
            case 1:
                return new Rectangle(color,nx, ny, width, height);
        }
        return new Circle(color,10, 10,  width * 2);

    }

    Main(){
        super("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JLayeredPane pane = getLayeredPane();
        for (int i = 0; i < 20; i++){
            Shapes shape = paintShape();
            shape.setBounds(0, 0, 1000, 800);
            pane.add(shape);
        }
        setSize(1000, 800);
        setVisible(true);
    }

    public static void main (String[] args){
        new Main();
    }
}
