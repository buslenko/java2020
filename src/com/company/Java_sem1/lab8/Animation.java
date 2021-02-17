package com.company.Java_sem1.lab8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Animation extends JFrame {

    private static String text;
    private static Image image;
    private static ArrayList<Image> pics = new ArrayList<>();

    Animation(){
        super("Animation");
        setLayout(new FlowLayout());
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D pic = (Graphics2D) g;
        pic.drawImage(image,0,0, 700, 500, null);
    }

    public static void main(String[] args) {
        new Animation();
        pics.add(new ImageIcon("src/com/company/lab8/anim.png").getImage());
        pics.add(new ImageIcon("src/com/company/lab8/anim1.png").getImage());
        pics.add(new ImageIcon("src/com/company/lab8/anim2.png").getImage());
        Animation gif = new Animation();
        while(true){
            for (int i = 0; i < pics.size(); i++) {
                image = pics.get(i);
                gif.repaint();
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}