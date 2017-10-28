/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import static com.sun.glass.events.DndEvent.EXIT;
import static com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting.ON;
import static javax.swing.DropMode.ON;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author J2EE-33
 */
public class SketchFrame extends JFrame {

    public SketchFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenu elementMenu = new JMenu("Elements");

        menuBar.add(fileMenu);
        menuBar.add(elementMenu);

    }
    private JMenuBar menuBar = new JMenuBar();
}
