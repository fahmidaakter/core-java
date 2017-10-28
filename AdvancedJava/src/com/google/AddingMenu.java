/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author J2EE-33
 */
public class AddingMenu {

    JMenu menu1, menu2, item2, subitem2;
    JMenuItem item1, item3, subitem1, childitem1, childitem2;

    AddingMenu() {
        JFrame f = new JFrame("Try menu");
        JMenuBar menuBar = new JMenuBar();

        menu1 = new JMenu("File");
            item1 = new JMenuItem("New");
            item2 = new JMenu("Open");
                subitem1 = new JMenuItem("From computer");
                subitem2 = new JMenu("From remote");
                    childitem1 = new JMenuItem("github");
                    childitem2 = new JMenuItem("bitburcal");
            item3 = new JMenuItem("Exit");
        menu2 = new JMenu("Help");
        

        menu1.add(item1);
        menu1.addSeparator();
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        
        item2.add(subitem1);
        item2.addSeparator();
        item2.add(subitem2);

        subitem2.add(childitem1);
        subitem2.addSeparator();
        subitem2.add(childitem2);

        menuBar.add(menu1);
        menuBar.add(menu2);
        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AddingMenu();
    }

}
