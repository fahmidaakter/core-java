/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author J2EE-33
 */
public class Point {

    private Point(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Point[] createArray() {
        Point[] p;
        p = new Point[10];
        for (int i = 0; i < 10; i++) {
            p[i] = new Point (i, i + 1);
        }
        return p;

    }
}