package com.company.Java_sem1.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public static final int width = 800;
    public static final int height = 600;
    private static final double G = 6.67;
    public Main(){
        super("Planets");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton btn = new JButton("Click");
        JComboBox planetList = new JComboBox(Planets.values());
        JLabel label1 = new JLabel("Гравитации Земли = 9.8");
        JPanel pane = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Planets planets = (Planets)planetList.getSelectedItem();

                double grav = planets.gravity() / 1000000000000.00;
                label1.setText("Гравитация " + planets.getName() + " = " + grav);
            }
        });
        pane.add(label1);
        pane.add(btn);
        pane.add(planetList);
        setContentPane(pane);
        setSize(width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

