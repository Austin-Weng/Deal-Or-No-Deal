package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.ImageIcon;

public class Dond implements ActionListener{
    JFrame frame;
    JPanel numLeftPanel, numRightPanel, casePanel, uiPanel, bankerPanel;
    JLabel zeroPOne, one, five, ten, fifty, oneHundred, fiveHundred, oneThousand, fiveThousand,
            tenThousand, fiftyThousand,oneHundredThousand, fiveHundredThousand, oneMillion, instructions, instruction, yourCaseNum, amountInCase, bankerOffer;
    JButton bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bTen, bEleven, bTwelve, bThirteen, bFourteen, keep, takeOffer;
    Case cOne, cTwo, cThree, cFour, cFive, cSix, cSeven, cEight, cNine, cTen, cEleven, cTwelve, cThirteen, cFourteen;

    ImageIcon icon = new ImageIcon("src/pixelCase (1).png");
    Image img = icon.getImage();
    Image newImg = img.getScaledInstance(80, 60, java.awt.Image.SCALE_SMOOTH);
    ImageIcon icon1 = new ImageIcon(newImg);
    public ArrayList<Case> cases = new ArrayList<Case>();
    int buttonWidth = 80;
    int buttonHeight = 60;
    int phase = 0;
    int amountChosen = 0;
    int amountOffered1 = (int) (Math.random() * 90000 + 10000);
    int amountOffered2 = (int) (Math.random() * 150000 + 30000);
    int amountOffered3 = (int) (Math.random() * 150000 + 50000);
    boolean firstCase = false;
    Case userCase;

    public Dond() {
        frame = new JFrame("Deal Or No Deal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(700, 600);
        frame.setVisible(true);

        numLeftPanel = new JPanel();
        numLeftPanel.setLayout(new BoxLayout(numLeftPanel, BoxLayout.Y_AXIS));

        numRightPanel = new JPanel();
        numRightPanel.setLayout(new BoxLayout(numRightPanel, BoxLayout.Y_AXIS));

        casePanel = new JPanel();
        casePanel.setLayout(new FlowLayout());

        uiPanel = new JPanel();
        uiPanel.setLayout(new FlowLayout());

        bankerPanel = new JPanel();
        bankerPanel.setLayout(new BoxLayout(bankerPanel, BoxLayout.Y_AXIS));
        uiPanel.add(bankerPanel);

        instructions = new JLabel("Instructions: ");
        uiPanel.add(instructions);

        instruction = new JLabel("Choose a case!");
        uiPanel.add(instruction);

        yourCaseNum = new JLabel("Your case number: ");
        uiPanel.add(yourCaseNum);

        bankerOffer = new JLabel("");
        bankerPanel.add(bankerOffer);

        keep = new JButton("Keep Playing");
        keep.addActionListener(this);


        takeOffer = new JButton("Take Offer");
        takeOffer.addActionListener(this);

        bankerPanel.add(takeOffer);
        bankerPanel.add(keep);

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

        bOne = new JButton("1", icon1);
        bOne.setVerticalTextPosition(SwingConstants.BOTTOM);
        bOne.setHorizontalTextPosition(SwingConstants.CENTER);
        bOne.addActionListener( this);
        casePanel.add(bOne);

        bTwo = new JButton("2", icon1);
        bTwo.setVerticalTextPosition(SwingConstants.BOTTOM);
        bTwo.setHorizontalTextPosition(SwingConstants.CENTER);
        bTwo.addActionListener( this);
        casePanel.add(bTwo);

        bThree = new JButton("3" , icon1);
        bThree.setVerticalTextPosition(SwingConstants.BOTTOM);
        bThree.setHorizontalTextPosition(SwingConstants.CENTER);
        bThree.addActionListener( this);
        casePanel.add(bThree);

        bFour = new JButton("4", icon1);
        bFour.setVerticalTextPosition(SwingConstants.BOTTOM);
        bFour.setHorizontalTextPosition(SwingConstants.CENTER);
        bFour.addActionListener( this);
        casePanel.add(bFour);

        bFive = new JButton("5", icon1);
        bFive.setVerticalTextPosition(SwingConstants.BOTTOM);
        bFive.setHorizontalTextPosition(SwingConstants.CENTER);
        bFive.addActionListener( this);
        casePanel.add(bFive);

        bSix = new JButton("6", icon1);
        bSix.setVerticalTextPosition(SwingConstants.BOTTOM);
        bSix.setHorizontalTextPosition(SwingConstants.CENTER);
        bSix.addActionListener( this);
        casePanel.add(bSix);

        bSeven = new JButton("7", icon1);
        bSeven.setVerticalTextPosition(SwingConstants.BOTTOM);
        bSeven.setHorizontalTextPosition(SwingConstants.CENTER);
        bSeven.addActionListener( this);
        casePanel.add(bSeven);

        bEight = new JButton("8", icon1);
        bEight.setVerticalTextPosition(SwingConstants.BOTTOM);
        bEight.setHorizontalTextPosition(SwingConstants.CENTER);
        bEight.addActionListener( this);
        casePanel.add(bEight);

        bNine = new JButton("9", icon1);
        bNine.setVerticalTextPosition(SwingConstants.BOTTOM);
        bNine.setHorizontalTextPosition(SwingConstants.CENTER);
        bNine.addActionListener( this);
        casePanel.add(bNine);

        bTen = new JButton("10", icon1);
        bTen.setVerticalTextPosition(SwingConstants.BOTTOM);
        bTen.setHorizontalTextPosition(SwingConstants.CENTER);
        bTen.addActionListener( this);
        casePanel.add(bTen);

        bEleven = new JButton("11", icon1);
        bEleven.setVerticalTextPosition(SwingConstants.BOTTOM);
        bEleven.setHorizontalTextPosition(SwingConstants.CENTER);
        bEleven.addActionListener( this);
        casePanel.add(bEleven);

        bTwelve = new JButton("12", icon1);
        bTwelve.setVerticalTextPosition(SwingConstants.BOTTOM);
        bTwelve.setHorizontalTextPosition(SwingConstants.CENTER);
        bTwelve.addActionListener( this);
        casePanel.add(bTwelve);

        bThirteen = new JButton("13", icon1);
        bThirteen.setVerticalTextPosition(SwingConstants.BOTTOM);
        bThirteen.setHorizontalTextPosition(SwingConstants.CENTER);
        bThirteen.addActionListener( this);
        casePanel.add(bThirteen);

        bFourteen = new JButton("14", icon1);
        bFourteen.setVerticalTextPosition(SwingConstants.BOTTOM);
        bFourteen.setHorizontalTextPosition(SwingConstants.CENTER);
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
        frame.setSize(600,500);
    }

    public void actionPerformed(ActionEvent e) {
        if (phase == 0) {
            System.out.println("In phase 0");
            checkFirstCase(e);
        } else if (phase == 1){
            System.out.println("In phase 1");
            phase1(e);
        } else if (phase == 2) {
            System.out.println("In phase 2");
            phase2(e);
        } else if (phase == 3) {
            System.out.println("In phase 3");
            phase3(e);
        } else if (phase == 4) {
            System.out.println("In phase 4");
            phase4(e);
        } else if (phase == 5) {
            System.out.println("In phase 5");
            phase5(e);
        } else if (phase == 6) {
            System.out.println("In phase 6");
            phase6(e);
        }

    }

    public void buttonPressed (Case casePressed){
        casePressed.setBeenPressed(true);
        casePressed.getButton().setBackground(Color.RED);
        casePressed.getLabel().setForeground(Color.RED);
    }

    public void checkFirstCase(ActionEvent e){
            for (Case aCase : cases) {
                if (e.getSource() == aCase.getButton()) {
                    aCase.getButton().setBackground(Color.RED);
                    userCase = aCase;
                    userCase.setBeenPressed(true);
                    instruction.setText("Choose " + (3 - amountChosen) + " more cases to eliminate");
                    yourCaseNum.setText("Your case number: " + aCase.getButton().getText());
                    phase = 1;
                }
            }
    }

    public void phase1(ActionEvent e){
        for (Case aCase : cases) {
//            System.out.println(amountChosen);
            if (!aCase.getBeenPressed()) {
                if (e.getSource() == aCase.getButton()) {
                    buttonPressed(aCase);
                    amountInCase.setText("Amount in case: " + aCase.getLabel());
                    amountChosen++;
                    instruction.setText("Choose " + (3 - amountChosen) + " more cases to eliminate");
                    if (amountChosen == 3){
                        bankerOffer.setText("Banker Offfer: $" + amountOffered1);
                        instruction.setText("Take banker offer or keep playing?");
                        amountChosen = 0;
                        phase = 2;
                        break;
                    }
                }
            }
        }
    }

    public void phase2(ActionEvent e) {
        instruction.setText("Take banker offer or keep playing?");

        if (e.getSource() == takeOffer){
            showMessageDialog(null, "Congrats! you won: $" + amountOffered1 + ", Your case had: " + userCase.getLabel().getText());
        } else if (e.getSource() == keep) {
            instruction.setText("Choose " + (3 - amountChosen) + " more cases to eliminate");
            phase = 3;
        }
    }

    public void phase3 (ActionEvent e){
        for (Case aCase : cases) {
//            System.out.println(amountChosen);
            if (!aCase.getBeenPressed()) {
                if (e.getSource() == aCase.getButton()) {
                    buttonPressed(aCase);
                    amountInCase.setText("Amount in case: " + aCase.getLabel());
                    amountChosen++;
                    instruction.setText("Choose " + (3 - amountChosen) + " more cases to eliminate");
                    if (amountChosen == 3){
                        amountChosen = 0;
                        while (amountOffered2 < amountOffered1) {
                            amountOffered2 = (int) (Math.random() * 150000 + 30000);
                        }
                        bankerOffer.setText("Banker Offer: $" + amountOffered2);
                        instruction.setText("Take banker offer or keep playing?");
                        phase = 4;
                        break;
                    }
                }
            }
        }
    }
    public void phase4(ActionEvent e) {
        instruction.setText("Take banker offer or keep playing?");
        if (e.getSource() == takeOffer){
            showMessageDialog(null, "Congrats! you won: $" + amountOffered2 + ", Your case had: " + userCase.getLabel().getText());
        } else if (e.getSource() == keep) {
            instruction.setText("Choose " + (3 - amountChosen) + " more cases to eliminate");
            phase = 5;
        }
    }

    public void phase5 (ActionEvent e){
        for (Case aCase : cases) {
//            System.out.println(amountChosen);
            if (!aCase.getBeenPressed()) {
                if (e.getSource() == aCase.getButton()) {
                    buttonPressed(aCase);
                    amountInCase.setText("Amount in case: " + aCase.getLabel());
                    amountChosen++;
                    instruction.setText("Choose " + (3 - amountChosen) + " more cases to eliminate");
                    if (amountChosen == 3){
                        amountChosen = 0;
                        while (amountOffered3 < amountOffered2) {
                            amountOffered3 = (int) (Math.random() * 150000 + 50000);
                        }
                        bankerOffer.setText("Banker Offer: $" + amountOffered3);
                        instruction.setText("Take banker offer or win your case?");
                        keep.setText("Win your case");
                        phase = 6;
                        break;
                    }
                }
            }
        }
    }

    public void phase6(ActionEvent e) {
        instruction.setText("Take banker offer or win your case?");
        amountOffered1 = (int) (Math.random() * 200000 + 50000);
        if (e.getSource() == takeOffer){
            frame.setVisible(false);
            showMessageDialog(null, "Congrats! you won: $" + amountOffered1 + ", Your case had: " + userCase.getLabel().getText());
        } else if (e.getSource() == keep) {
            frame.setVisible(false);
            showMessageDialog(null, "Your case had: " + userCase.getLabel().getText() + "\n Banker Offer: $" + amountOffered3);
        }
    }
}
