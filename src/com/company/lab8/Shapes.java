package com.company.lab8;
import javax.swing.*;
import java.awt.*;

public abstract class Shapes extends JComponent{
    private int x;
    private int y;
    private Color color;

    public Shapes(Color color, int x, int y){
        this.color= color;
        this.x=x;
        this.y=y;
    }

    public int  getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }

}
