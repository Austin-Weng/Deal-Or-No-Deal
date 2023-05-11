package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Dond {
    JFrame frame;
    JPanel numLeftPanel, numRightPanel, casePanel;
    JLabel zeroPOne, one, five, ten, fifty, oneHundred, fiveHundred, oneThousand, fiveThousand, tenThousand, fiftyThousand,oneHundredThousand, fiveHundredThousand, oneMillion;
    JButton bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bTen, bEleven, bTwelve, bThirteen, bFourteen;
    Case cOne, cTwo, cThree, cFour, cFive, cSix, cSeven, cEight, cNine, cTen, cEleven, cTwelve, cThirteen, cFourteen;

    private ArrayList<Case> cases;

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

        fifty = new JLabel("$50");
        fifty.setForeground(Color.GREEN);
        numLeftPanel.add(fifty);

        oneHundred = new JLabel("$100");
        oneHundred.setForeground(Color.GREEN);
        numLeftPanel.add(oneHundred);

        fiveHundred = new JLabel("$500");
        fiveHundred.setForeground(Color.GREEN);
        numLeftPanel.add(fiveHundred);

        casePanel = new JPanel();
        casePanel.setLayout(new FlowLayout());
        frame.add(numLeftPanel, BorderLayout.CENTER);

        cOne = new Case(bOne, zeroPOne);
        cTwo = new Case(bTwo, one);
        cThree = new Case(bThree, five);
        cFour = new Case(bFour, ten);
        cFive = new Case(bFive, fifty);
        cSix = new Case(bSix, oneHundred);
        cSeven = new Case(bSeven, fiveHundred);
        cEight = new Case(bEight, oneThousand);
        cNine = new Case(bNine, fiveThousand);
        cTen = new Case(bTen, tenThousand);
        cEleven = new Case(bEleven, fiftyThousand);
        cTwelve = new Case(bTwelve, oneHundredThousand);
        cThirteen = new Case(bThirteen, fiveHundredThousand);
        cFourteen = new Case(bFourteen, oneMillion);

        cases.add(cOne);
        cases.add(cTwo);
        cases.add(cThree);
        cases.add(cFour);
        cases.add(cFive);
        cases.add(cSix);
        cases.add(cSeven);
        cases.add(cEight);
        cases.add(cNine);
        cases.add(cTen);
        cases.add(cEleven);
        cases.add(cTwelve);
        cases.add(cThirteen);
        cases.add(cFourteen);

        for(int i = 0; i < 14; i++){
            int num1 = (int) (Math.random() * 14 + 1);
            int num2 = (int) (Math.random() * 14 + 1);
            Case temp = cases.get(num1);
            cases.set(num1, cases.get(num2));
            cases.set(num2, temp);
        }

        numRightPanel = new JPanel();
        numRightPanel.setLayout(new FlowLayout());
        frame.add(numRightPanel, BorderLayout.EAST);

    }
}
