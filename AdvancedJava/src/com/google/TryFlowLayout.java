/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author J2EE-33
 */
public class TryFlowLayout {

    static JFrame aWindow = new JFrame("this is a Flow Layout");

    public static void main(String[] args) {
        Toolkit thekit = aWindow.getToolkit();
        Dimension wndSize = thekit.getScreenSize();
        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(flow);
        for (int i = 1; i <= 6; i++) {
            content.add(new JButton("Press " + i));
        }
        aWindow.setVisible(true);
    }
}
