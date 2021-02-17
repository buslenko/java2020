package com.company.Java_sem1.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pic extends JFrame {
    public Pic(String href) throws IOException {
        super("Image");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(href));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }

    public static void main(String[] args) throws IOException {
        new Pic(args.length != 0 ? args[0] : "src/com/company/lab8/pic.png").setVisible(true);
    }
}
