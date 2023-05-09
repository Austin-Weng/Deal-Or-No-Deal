package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dond {
    JFrame frame;
    JPanel numLeftPanel, numRightPanel, casePanel;
    JLabel zeroPOne, one, five, ten, twentyFive, fifty, seventyFive, oneHundred, twoHundred, threeHundred, fourHundred, fiveHundred, sevenHundredFifty, oneThousand, fiveThousand, tenThousand, twentyFiveThousand, fiftyThousand, seventyFiveThousand, oneHundredThousand, twoHundredThousand, threeHundredThousand, fourHundredThousand, fiveHundredThousand, seventyFiveHundredThousand, oneMillion;

    public Dond() {
        frame = new JFrame("Deal Or No Deal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);

        numLeftPanel = new JPanel();
        numLeftPanel.setLayout(new BoxLayout(numLeftPanel, BoxLayout.Y_AXIS));
        frame.add(numLeftPanel, BorderLayout.WEST);

        zeroPOne = new JLabel("$0.1");
        zeroPOne.setForeground(Color.GREEN);
        numLeftPanel.add(zeroPOne);

        one = new JLabel("$1");
        one.setForeground(Color.GREEN);
        numLeftPanel.add(one);

        five = new JLabel("$5");
        five.setForeground(Color.GREEN);
        numLeftPanel.add(five);

        ten = new JLabel("$10");
        ten.setForeground(Color.GREEN);
        numLeftPanel.add(ten);

        twentyFive = new JLabel("$25");
        twentyFive.setForeground(Color.GREEN);
        numLeftPanel.add(twentyFive);

        fifty = new JLabel("$50");
        fifty.setForeground(Color.GREEN);
        numLeftPanel.add(fifty);

        seventyFive = new JLabel("$75");
        seventyFive.setForeground(Color.GREEN);
        numLeftPanel.add(seventyFive);

        oneHundred = new JLabel("$100");
        oneHundred.setForeground(Color.GREEN);
        numLeftPanel.add(oneHundred);

        twoHundred = new JLabel("$200");
        twoHundred.setForeground(Color.GREEN);
        numLeftPanel.add(twoHundred);

        threeHundred = new JLabel("$300");
        threeHundred.setForeground(Color.GREEN);
        numLeftPanel.add(threeHundred);

        fourHundred = new JLabel("$400");
        fourHundred.setForeground(Color.GREEN);
        numLeftPanel.add(fourHundred);

        fiveHundred = new JLabel("$500");
        fiveHundred.setForeground(Color.GREEN);
        numLeftPanel.add(fiveHundred);

        sevenHundredFifty = new JLabel("$750");
        sevenHundredFifty.setForeground(Color.GREEN);
        numLeftPanel.add(sevenHundredFifty);

        casePanel = new JPanel();
        casePanel.setLayout(new FlowLayout());
        frame.add(numLeftPanel, BorderLayout.CENTER);

        numRightPanel = new JPanel();
        numRightPanel.setLayout(new FlowLayout());
        frame.add(numRightPanel, BorderLayout.EAST);

    }
}
