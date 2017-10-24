/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import static com.google.CenteringAWindow.aWindow;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author J2EE-33
 */
public class TryWindow4 {

    static JFrame aWindow  = new JFrame("this is the Window Title");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        aWindow.getContentPane().setBackground(Color.ORANGE);
        aWindow.setVisible(true);
    }
}
