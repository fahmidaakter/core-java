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
public class IfElseStatement {

    public int x = 5;
    public int y = 10;

    public IfElseStatement() {
         
    }
    public String largeNum(int x, int y) {
        if (x > y) {
            return x + " is iarge number";
        } else {
            return y + " is iarge number";
        }
    }
}
