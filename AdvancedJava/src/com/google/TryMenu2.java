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
public class TryMenu2 {

    JMenu menu1, menu2, submenu;
    JMenuItem item1, item2, item3 ,h1, h2;

    TryMenu2() {
        JFrame f = new JFrame("Try menu");
        JMenuBar menuBar = new JMenuBar();

        menu1 = new JMenu("File");
        menu2 = new JMenu("Elements");

        item1 = new JMenuItem("New");
        item2 = new JMenuItem("Open");
        item3 = new JMenuItem("Exit");


        menu1.add(item1);
        menu1.addSeparator();
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        
        
        menu2= new JMenu("Help");
        submenu=new JMenu("submenu");
                menu2.add(submenu);

        
        h1=new JMenuItem("Live support");
        h2= new JMenuItem("Email support");
        submenu.add(h1);
        submenu.addSeparator();
        submenu.add(h2);
        submenu.addSeparator();
        

        menuBar.add(menu1);
        menuBar.add(menu2);
        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TryMenu2();
    }
}
