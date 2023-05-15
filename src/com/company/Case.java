package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Case {
    private JLabel label;
    private JButton button;
    private boolean beenPressed;

    public Case(JButton button, JLabel label, boolean beenPressed){
        this.button = button;
        this.label = label;
        this.beenPressed = beenPressed;
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

    public void setBeenPressed(boolean beenPressed) {
        this.beenPressed = beenPressed;
    }

    public boolean getBeenPressed(){
        return beenPressed;
    }

    public String toString(){
        return "Case Number: " + button.getText() + ", $ in Case: " + label.getText() + ", been selected: " + beenPressed;
    }
}
