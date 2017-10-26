/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import static com.google.TryBoxLayout.aWindow;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author J2EE-33
 */
public class TryBoxLayout4 {

    static JFrame aWindow = new JFrame("This is a Box Layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Box left = Box.createVerticalBox();
        left.add(Box.createVerticalStrut(30));
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton rbutton;

        radioGroup.add(rbutton = new JRadioButton("Red"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));
        radioGroup.add(rbutton = new JRadioButton("Green"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));
        radioGroup.add(rbutton = new JRadioButton("Blue"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));
        radioGroup.add(rbutton = new JRadioButton("Yellow"));

        left.add(rbutton);
        left.add(Box.createVerticalStrut(30));
        left.add(Box.createGlue());

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Color"));
        leftPanel.add(left, BorderLayout.CENTER);

        Box right = Box.createVerticalBox();
        right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("Dashed"));
        right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("Thick"));
        right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("Rounded"));
        right.add(Box.createVerticalStrut(30));
        left.add(Box.createGlue());

        JPanel bottomPanel = new JPanel();
        Border edge = BorderFactory.createRaisedBevelBorder();
        JButton button;
        Dimension size = new Dimension(80, 20);
        bottomPanel.add(button = new JButton("Defaults"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("OK"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("CANCEL"));
        button.setBorder(edge);
        button.setPreferredSize(size);

        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Properties"));
        rightPanel.add(right, BorderLayout.CENTER);

        Box top = Box.createHorizontalBox();

        top.add(leftPanel);
        top.add(Box.createHorizontalStrut(5));
        top.add(rightPanel);

        bottomPanel.setBorder(new CompoundBorder(
                BorderFactory.createLineBorder(Color.black, 1),
                BorderFactory.createBevelBorder(BevelBorder.RAISED)
        ));

        Container content = aWindow.getContentPane();

        BoxLayout box = new BoxLayout(content, BoxLayout.Y_AXIS);
        content.setLayout(box);
        content.add(top);
        content.add(bottomPanel);

        aWindow.pack();
        aWindow.setVisible(true);

    }
}
