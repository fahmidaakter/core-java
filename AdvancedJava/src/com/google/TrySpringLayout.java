/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import static com.google.TryGridBagLayout.aWindow;
import static com.google.TryGridLayout.aWindow;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;

/**
 *
 * @author J2EE-33
 */
public class TrySpringLayout {

    static JFrame aWindow = new JFrame("This is a Spring Layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();

        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpringLayout layout = new SpringLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(layout);

        JButton[] buttons = new JButton[6];
        SpringLayout.Constraints con = null;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Press" + (i + 1));
            content.add(buttons[i]);
        }
        Spring xSpring = Spring.constant(5, 15, 25);
        Spring ySpring = Spring.constant(10, 30, 50);

        con = layout.getConstraints(buttons[0]);
        con.setX(xSpring);
        con.setY(ySpring);

        for (int i = 1; i < buttons.length; i++) {
            con = layout.getConstraints(buttons[i]);
            layout.putConstraint(SpringLayout.WEST, buttons[i], xSpring, SpringLayout.EAST, buttons[i - 1]);
            layout.putConstraint(SpringLayout.NORTH, buttons[i], ySpring, SpringLayout.SOUTH, buttons[i - 1]);
        }

        aWindow.setVisible(true);

    }
}
