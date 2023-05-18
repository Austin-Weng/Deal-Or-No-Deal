package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Dond implements ActionListener{
    JFrame frame;
    JPanel numLeftPanel, numRightPanel, casePanel, uiPanel;
    JLabel zeroPOne, one, five, ten, fifty, oneHundred, fiveHundred, oneThousand, fiveThousand,
            tenThousand, fiftyThousand,oneHundredThousand, fiveHundredThousand, oneMillion, instructions, instruction, yourCaseNum, amountInCase;
    JButton bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bTen, bEleven, bTwelve, bThirteen, bFourteen, keep, takeOffer;
    Case cOne, cTwo, cThree, cFour, cFive, cSix, cSeven, cEight, cNine, cTen, cEleven, cTwelve, cThirteen, cFourteen;

    public ArrayList<Case> cases = new ArrayList<Case>();
    int buttonWidth = 80;
    int buttonHeight = 60;
    int phase = 0;
    int amountChosen = 0;
    boolean firstCase = false;
    String userCase = "";

    public Dond() {
        frame = new JFrame("Deal Or No Deal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 400);
        frame.setVisible(true);

        numLeftPanel = new JPanel();
        numLeftPanel.setLayout(new BoxLayout(numLeftPanel, BoxLayout.Y_AXIS));

        numRightPanel = new JPanel();
        numRightPanel.setLayout(new BoxLayout(numRightPanel, BoxLayout.Y_AXIS));

        casePanel = new JPanel();
        casePanel.setLayout(new FlowLayout());

        uiPanel = new JPanel();
        uiPanel.setLayout(new FlowLayout());

        instructions = new JLabel("Instructions: ");
        uiPanel.add(instructions);

        instruction = new JLabel("Choose a case!");
        uiPanel.add(instruction);

        keep = new JButton("Keep Playing");
        uiPanel.add(keep);

        takeOffer = new JButton("Take Offer");
        uiPanel.add(takeOffer);

        yourCaseNum = new JLabel("Your case number: ");
        uiPanel.add(yourCaseNum);

        amountInCase = new JLabel("");
        uiPanel.add(amountInCase);

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

        oneThousand = new JLabel("$1,000");
        oneThousand.setForeground(Color.GREEN);
        numRightPanel.add(oneThousand);

        fiveThousand = new JLabel("$5,000");
        fiveThousand.setForeground(Color.GREEN);
        numRightPanel.add(fiveThousand);

        tenThousand = new JLabel("$10,000");
        tenThousand.setForeground(Color.GREEN);
        numRightPanel.add(tenThousand);

        fiftyThousand = new JLabel("$50,000");
        fiftyThousand.setForeground(Color.GREEN);
        numRightPanel.add(fiftyThousand);

        oneHundredThousand = new JLabel("$100,000");
        oneHundredThousand.setForeground(Color.GREEN);
        numRightPanel.add(oneHundredThousand);

        fiveHundredThousand = new JLabel("$500,000");
        fiveHundredThousand.setForeground(Color.GREEN);
        numRightPanel.add(fiveHundredThousand);

        oneMillion = new JLabel("$1,000,000");
        oneMillion.setForeground(Color.GREEN);
        numRightPanel.add(oneMillion);

        casePanel = new JPanel();
        casePanel.setLayout(new FlowLayout());
        frame.add(numLeftPanel, BorderLayout.CENTER);

        bOne = new JButton("1");
        bOne.addActionListener( this);
        bOne.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        casePanel.add(bOne);

        bTwo = new JButton("2");
        bTwo.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bTwo.addActionListener( this);
        casePanel.add(bTwo);

        bThree = new JButton("3");
        bThree.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bThree.addActionListener( this);
        casePanel.add(bThree);

        bFour = new JButton("4");
        bFour.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bFour.addActionListener( this);
        casePanel.add(bFour);

        bFive = new JButton("5");
        bFive.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bFive.addActionListener( this);
        casePanel.add(bFive);

        bSix = new JButton("6");
        bSix.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bSix.addActionListener( this);
        casePanel.add(bSix);

        bSeven = new JButton("7");
        bSeven.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bSeven.addActionListener( this);
        casePanel.add(bSeven);

        bEight = new JButton("8");
        bEight.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bEight.addActionListener( this);
        casePanel.add(bEight);

        bNine = new JButton("9");
        bNine.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bNine.addActionListener( this);
        casePanel.add(bNine);

        bTen = new JButton("10");
        bTen.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bTen.addActionListener( this);
        casePanel.add(bTen);

        bEleven = new JButton("11");
        bEleven.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bEleven.addActionListener( this);
        casePanel.add(bEleven);

        bTwelve = new JButton("12");
        bTwelve.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bTwelve.addActionListener( this);
        casePanel.add(bTwelve);

        bThirteen = new JButton("13");
        bThirteen.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bThirteen.addActionListener( this);
        casePanel.add(bThirteen);

        bFourteen = new JButton("14");
        bFourteen.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        bFourteen.addActionListener( this);
        casePanel.add(bFourteen);

        cOne = new Case(bOne, zeroPOne, false);
        cTwo = new Case(bTwo, one, false);
        cThree = new Case(bThree, five, false);
        cFour = new Case(bFour, ten,false);
        cFive = new Case(bFive, fifty,false);
        cSix = new Case(bSix, oneHundred,false);
        cSeven = new Case(bSeven, fiveHundred,false);
        cEight = new Case(bEight, oneThousand,false);
        cNine = new Case(bNine, fiveThousand,false);
        cTen = new Case(bTen, tenThousand,false);
        cEleven = new Case(bEleven, fiftyThousand,false);
        cTwelve = new Case(bTwelve, oneHundredThousand,false);
        cThirteen = new Case(bThirteen, fiveHundredThousand,false);
        cFourteen = new Case(bFourteen, oneMillion,false);

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
            int num1 = (int) (Math.random() * 14);
            int num2 = (int) (Math.random() * 14);
            JLabel temp = cases.get(num1).getLabel();
            cases.get(num1).setLabel(cases.get(num2).getLabel());
            cases.get(num2).setLabel(temp);
        }

        for (int i = 0; i < cases.size(); i++) {
            System.out.println(cases.get(i));
        }

        frame.add(numLeftPanel, BorderLayout.WEST);
        frame.add(numRightPanel, BorderLayout.EAST);
        frame.add(casePanel, BorderLayout.CENTER);
        frame.add(uiPanel, BorderLayout.SOUTH);
        frame.pack();
    }

    public void actionPerformed(ActionEvent e) {
        if (phase == 0) {
            checkFirstCase(e);
        }
        if (phase == 1){
            phase1(e);
        }

    }

    public void buttonPressed (Case casePressed){
        casePressed.setBeenPressed(true);
        casePressed.getButton().setBackground(Color.RED);
    }

    public void checkFirstCase(ActionEvent e){
        if (!firstCase) {
            for (Case aCase : cases) {
                if (e.getSource() == aCase.getButton()) {
                    firstCase = true;
                    userCase = aCase.getLabel().getText();
                    phase = 1;
                    yourCaseNum.setText("Your case number: " + aCase.getButton().getText());
                }
            }
        }
    }

    public void phase1(ActionEvent e){
        while (amountChosen < 4) {
            instruction.setText("Choose " + amountChosen + " more cases");
            System.out.println("working 1");
            System.out.println(amountChosen);
            for (Case aCase : cases) {
                if (!aCase.getBeenPressed()) {
                    System.out.println("working 2");
                    if (e.getActionCommand().equals(aCase.getButton().getText())) {
                        System.out.println("working 3");
                        buttonPressed(aCase);
                        amountInCase.setText("Amount in case: " + aCase.getLabel());
                        amountChosen++;
                        break;
                    }
                }
            }
        }
        amountChosen = 0;
        phase = 2;
    }
}
