/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googlels;

import java.util.Date;

/**
 *
 * @author J2EE-33
 */
public class ToString {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("now");
        System.out.println("After using ToString");
        ///////
        String x="10";
        int y=Integer.parseInt(x);
        String z=Integer.toString(y);
        System.out.println("x as String : "+ x);
        System.out.println("y as int : "+ y);
        System.out.println("z as String : "+ z);
    }

}
