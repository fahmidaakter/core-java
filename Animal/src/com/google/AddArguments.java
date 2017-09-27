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
public class AddArguments {

    public static void main(String[] args) {
        try {
            int sum = 0;
            String[] b;
            b = new String[]{"1", "2", "3", "4"};
            for (String b1 : b) {
                sum += Integer.parseInt(b1);
            }
            System.out.println("Sum = " + sum);

        } catch (NumberFormatException nfe) {
            System.err.println("one of the command line" + "arguments is not an integer");
        }
    }
}
