/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author J2EE-33
 */
public class TryBorderLayout {

    static JFrame aWindow = new JFrame("this is a Border Layout");

    public static void main(String[] args) {
        Toolkit thekit = aWindow.getToolkit();
        Dimension wndSize = thekit.getScreenSize();
        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        BorderLayout border = new BorderLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(border);
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        JButton button;
        content.add(button = new JButton("EAST"), BorderLayout.EAST);
        button.setBorder(edge);
        content.add(button = new JButton("WEST"), BorderLayout.WEST);
        button.setBorder(edge);
        content.add(button = new JButton("NORTH"), BorderLayout.NORTH);
        button.setBorder(edge);
        content.add(button = new JButton("SOUTH"), BorderLayout.SOUTH);
        button.setBorder(edge);
        content.add(button = new JButton("CENTER"), BorderLayout.CENTER);
        button.setBorder(edge);
        aWindow.setVisible(true);
        
    }
}
