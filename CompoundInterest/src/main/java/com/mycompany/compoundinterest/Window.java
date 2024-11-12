package com.mycompany.compoundinterest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JTextField textField;

    public Window() {
        prepareGUI();
    }
    
    private void prepareGUI() {
        mainFrame = new JFrame("Compound Interest Calculation");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350,100);
        textField = new JTextField();
        textField.setSize(500, 50);
        
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        /*
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed() {
                textField.
            }
        });
        */
        mainFrame.add(headerLabel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        textField.setBackground(Color.red);
        textField.setVisible(true);
    }
    
    private void updateTextField() {
        
    }
}
