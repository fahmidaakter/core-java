/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import static java.awt.SystemColor.menu;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author J2EE-33
 */
public class TryMenu3 {

    JMenu menu1, exit;
    JMenuItem item1, item2;

    TryMenu3() {
        JFrame f = new JFrame("Try menu");
        JMenuBar mb = new JMenuBar();
        menu1 = new JMenu("File");

        item1 = new JMenuItem("Exit");
        item1.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_DOWN_MASK));
        
        mb.add(menu1);
        menu1.add(item1);
        f.setJMenuBar(mb);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TryMenu3();
    }
}


