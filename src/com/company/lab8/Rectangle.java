package com.company.lab8;

import java.awt.*;
public class Rectangle extends Shapes{
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height){
        super(color, x, y);
        this.height=height;
        this.width=width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        g2d.fillRect(getX(), getY(), width, height);

    }
}
