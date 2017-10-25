/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author J2EE-33
 */
public class CardLayouts extends JApplet implements ActionListener {

    CardLayout card = new CardLayout(50, 50);

    @Override
    public void init() {
        Container content = getContentPane();
        content.setLayout(card);
        JButton button;
        for (int i = 1; i <= 6; i++) {
            content.add(button = new JButton("Press " + i), "Card" + i);
            button.addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(getContentPane());
    }
}
