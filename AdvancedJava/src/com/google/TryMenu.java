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
public class TryMenu {

    TryMenu() {
        JFrame f = new JFrame("Try  Menu");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TryMenu();
    }
}
