/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.november2;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class MouseListenerEx extends JFrame implements MouseListener {

    Label l;

    MouseListenerEx() {
        addMouseListener(this);

        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse is clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("MOUSE IS pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse is relesed");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse is Entred");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse is Exited");
    }

}
