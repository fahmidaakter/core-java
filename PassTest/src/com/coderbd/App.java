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
public class App {
    public static void main(String[] args) {
        MyDate obj=new MyDate(23,9,2017);
        obj.addDays(5);
        System.out.println(obj.addDays(5));
    }
    
}
