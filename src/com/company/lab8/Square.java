package com.company.lab8;
import java.awt.*;

public class Square extends Shapes {
    private int size;

    public  Square(Color color, int x, int y, int size){
        super(color, x, y);
        this.size=size;
    }


    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        g2d.fillRect(getX(), getY(), size, size);
    }
}
