/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.Images;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import sun.applet.Main;

/**
 *
 * @author J2EE-33
 */
public class Icon {

    public Icon() {

        JFrame frame = new JFrame("JTool bar demo");
        JToolBar toolbar = new JToolBar("Applications");
        JButton btnCalender = new JButton(new ImageIcon(getClass().getResource("Open.gif")));
        JButton btnClock = new JButton(new ImageIcon(getClass().getResource("Blue.gif")));
        JButton btnContacts = new JButton(new ImageIcon(getClass().getResource("Blue.gif")));
        JButton btnMail = new JButton(new ImageIcon(getClass().getResource("Yellow.gif")));
        JButton btnPhone = new JButton(new ImageIcon(getClass().getResource("Green.gif")));
        JButton btnMessages = new JButton(new ImageIcon(getClass().getResource("Line.gif")));

        toolbar.add(btnCalender);
        toolbar.add(btnClock);
        toolbar.add(btnContacts);
        toolbar.add(btnMail);
        toolbar.add(btnPhone);
        toolbar.add(btnMessages);

        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(toolbar, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Icon();
    }
}
