package com.company.lab8;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shapes {
    private double radius;

    public Circle(Color color, int x, int y, double radius){
        super(color, x, y);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(getX(), getY(), 2*radius, 2*radius);
        g2d.setColor(getColor());
        g2d.fill(circle);
    }
}
