/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import static com.google.TryGridLayout.aWindow;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author J2EE-33
 */
public class Sketcher1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                creatGUI();
            }
        }
        );
    }

    static void creatGUI() {
        window = new SketchFrame("Sketcher");
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }

    private static SketchFrame window;
}
