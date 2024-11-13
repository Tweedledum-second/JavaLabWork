package com.mycompany.compoundinterest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel informationLabel;
    private JTextField textField;

    public Window() {
        prepareGUI();
    }
    
    private void prepareGUI() {
        mainFrame = new JFrame("Compound Interest Calculation");
        mainFrame.setSize(400,400);
        mainFrame.setBackground(Color.BLACK);
        //mainFrame.setLayout(new GridLayout(18,2));
        
        headerLabel = new JLabel("", JLabel.CENTER);
        informationLabel = new JLabel("", JLabel.RIGHT);
        informationLabel.setSize(100,100);
        informationLabel.setText("Для работы программы придерживайтесь такой "
                + "формы записи: число%количество_процентов=");
        textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.PLAIN , 12));
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setSize(300, 14);
        mainFrame.add(informationLabel);
        
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
      /*  textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                
            }
            @Override
        });*/
        mainFrame.add(headerLabel);
        mainFrame.add(informationLabel);
        mainFrame.add(textField);
        mainFrame.setVisible(true);
        informationLabel.setForeground(Color.WHITE);
        informationLabel.setVisible(true);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setSelectedTextColor(Color.WHITE);
        textField.setForeground(Color.WHITE);
        textField.setVisible(true);
    }
    
    private void updateTextField() {
        
    }
}
