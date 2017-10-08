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
public class TestThrow {

    public static void main(String[] args) {
        try {
            TestThrow met = new TestThrow();
            System.out.println("length of DHAKA is " + met.getStringSize("DHAKA"));
            System.out.println("length of hasina is " + met.getStringSize("HASINA"));
            System.out.println("length of DHAKA is " + met.getStringSize(null));
            System.out.println("length of DHAKA is " + met.getStringSize("FENI"));

        } catch (Exception ex) {
            System.out.println("Exception message: " + ex.getMessage());
        }
    }

    public int getStringSize(String str) throws Exception {
        if (str == null) {
            throw new CustomException("String can not br nulled");
        }
        return str.length();
    }
}
