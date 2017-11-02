/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.november2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author J2EE-33
 */
public class JavaToolTipExample {

    public JavaToolTipExample() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tooltipLabel = new JLabel("User Name");
        
        tooltipLabel.setToolTipText("Enter your username");
        
        JTextField tooltipTextfield = new JTextField(10);
        
        tooltipTextfield.setToolTipText("enter your user name over here, that oher");
        
        JButton tooltipButton = new JButton("Click me");
        
        tooltipButton.setToolTipText("Click this button to make something happen");
        
        frame.getContentPane().setLayout(new FlowLayout());
        
        frame.add(tooltipLabel);
        
        frame.getContentPane().add(tooltipTextfield);
        
        frame.getContentPane().add(tooltipButton);
        

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new JavaToolTipExample();
    }

}
