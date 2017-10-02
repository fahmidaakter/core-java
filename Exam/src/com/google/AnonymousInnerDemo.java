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
public class AnonymousInnerDemo {

    public static void main(String[] args) {
        BB b = new BB() {
            @Override
            public void displayingMsg() {
                System.out.println("Hi, I am a  method from class AA");
            }
        };
        b.displayingMsg();
    }
}
