/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class TryWindow {
// The window object
    static JFrame aWindow = new JFrame("This is the window title");
    public static void main(String[] args) {
        int windowWidth =400;
        int windowHight =150;
        aWindow.setBounds(50,100,windowWidth, windowHight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
    
}
