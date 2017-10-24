/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class ColorAndCursor {
    public static void main(String[] args) {
        JFrame aWindow = new JFrame("Resize window");
           Toolkit thekit = aWindow.getToolkit();
           Dimension wndSize = thekit.getScreenSize();
           aWindow.setBounds(wndSize.width/4  ,wndSize.height/4, wndSize.width/2, wndSize.height/2);
           aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           aWindow.setCursor(Cursor.getPredefinedCursor(Cursor. DEFAULT_CURSOR ));
           aWindow.getContentPane().setBackground(Color.PINK);
           aWindow.setVisible(true);
           
    }
  
}
