/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

/**
 *
 * @author J2EE-33
 */
public class ClassTest extends com.google.ClassOne {

    public static void main(String[] args) {
        char a = new ClassOne().getVar();
        char b = new ClassTest().getVar();
        System.out.println(a);
        System.out.println(b);
    }
}
