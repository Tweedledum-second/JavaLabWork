package com.mycompany.compoundinterest;

public class InheritKeyListener implements java.awt.event.KeyListener {
    @Override 
    public void keyTyped(java.awt.event.KeyEvent e) {
        System.out.println("Напечатано " + e.getKeyChar());
    }
    @Override 
    public void keyPressed(java.awt.event.KeyEvent e) {
        System.out.println("Зажато " + e.getKeyChar());
    }
    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        System.out.println("Отпущено " + e.getKeyChar());
    }
}
