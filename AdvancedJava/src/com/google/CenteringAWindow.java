/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;

/**
 *
 * @author J2EE-33
 */
public class CenteringAWindow {
    static JFrame aWindow = new JFrame("This is the Window Title");
    public static void main(String[] args) {
        Point center =
                GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
           int windowWidth =500;
        int windowHeight =250;
        //set position and size
        aWindow.setBounds(center.x-windowWidth/2, center.y-windowHeight/2,
                windowWidth,windowHeight);
            aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
