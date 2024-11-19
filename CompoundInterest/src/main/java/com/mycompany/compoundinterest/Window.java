package com.mycompany.compoundinterest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window {
    private JFrame mainFrame;
    private JTextArea informationLabel;
    private JTextField textField;
    private JPanel textPanel;
    private KeyAdapter controller;
    private CompoundInterestCalculation calculator;

    public Window() {
        prepareGUI();
    }
    
    private void prepareGUI() {
        calculator = new CompoundInterestCalculation();
        mainFrame = new JFrame("Compound Interest Calculation");
        mainFrame.setSize(400,400);
        mainFrame.setBackground(Color.WHITE);
        mainFrame.setLocationRelativeTo(null);
        
        textPanel = new JPanel(new BorderLayout(1,2));
        
        informationLabel = new JTextArea();
        informationLabel.setText("Для работы программы придерживайтесь такой "
                + "формы записи: число%процент,циклы=");
        informationLabel.setWrapStyleWord(true);
        informationLabel.setLineWrap(true);
        informationLabel.setEditable(false);
        informationLabel.setSize(600,100);
        
        textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.PLAIN , 12));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setSize(200, 200);
        
        textPanel.add(informationLabel);
        textPanel.add(textField);
        
        
        mainFrame.add(informationLabel);
        
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        controller =  new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent event) {
            executeKeyPressed(event);
        }
    };
        
        textField.addKeyListener(controller);
              
        informationLabel.setBackground(Color.BLACK);
        informationLabel.setForeground(Color.WHITE);
        informationLabel.setDisabledTextColor(Color.WHITE);
        informationLabel.setSelectedTextColor(Color.red);
        
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setForeground(Color.WHITE);
        
        mainFrame.setBackground(Color.BLACK);
        mainFrame.getContentPane().add(BorderLayout.NORTH, textPanel);
        //mainFrame.getContentPane().add(BorderLayout.CENTER, textField);

        mainFrame.setVisible(true);
        textPanel.setVisible(true);
        informationLabel.setVisible(true);
        textField.setVisible(true);
    }
    
    private void updateTextField() {
        
    }
    
    private void executeKeyPressed(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_ENTER) {
            calculator.calculateCompoundInterest(textField.getText());
        }
    }
}
