package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Case {
    private String label;
    private JButton button;

    public Case(JButton button, String label){
        this.button = button;
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public JButton getButton(){
        return button;
    }

    public void setButton(JButton button){
        this.button = button;
    }
}
