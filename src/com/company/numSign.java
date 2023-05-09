package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class numSign {
    private JLabel label;
    private JLabel color;

    public numSign(String label) {
        this.label = new JLabel(label);
        this.color = new JLabel("\t█\t█\t█");
        this.color.setForeground(Color.GREEN);
    }

    public Boolean canSelect() {
        return color.getForeground() == Color.GREEN;
    }

    public void setColorRed() {
        color.setForeground(Color.RED);
    }

}
