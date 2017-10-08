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
public class TestCustomException {

    public static void main(String[] a) {
        try {
            TestCustomException.myTestmethod(null);

        } catch (Exception mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }

    }

    static void myTestmethod(String str) throws CustomException {
        if (str == null) {
            throw new CustomException("String val is null");
        }

    }
}
