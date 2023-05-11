package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Case {
    private JLabel label;
    private JButton button;

    public Case(JButton button, JLabel label){
        this.button = button;
        this.label = label;
    }

    public JLabel getLabel(){
        return label;
    }

    public void setLabel(JLabel label){
        this.label = label;
    }

    public JButton getButton(){
        return button;
    }

    public void setButton(JButton button){
        this.button = button;
    }
}
