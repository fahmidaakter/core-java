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
public class CheackedException {

    public static void main(String[] args) {
        int sum = 0;
                String[] ab = {"1", "2", "4", "six"};

        for (String arg : ab) {
            try {
             
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException nfe) {
                System.err.println("[" + arg + "] is not an integer" + "and will not be included in the sum.");
            }
        }
        System.out.println("Sum = " + sum);
    }
}
