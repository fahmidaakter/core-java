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
public class EqualIdentity {
    public static void main(String[] args) {
        String hello ="Hello";
        String hell= "Hel" +"lo";
        if(hello == hell){
            System.out.println("both are identicaly equal");
        }
        if(hello.equals(hell)){
        System.out.println("both are equal");
        }
        
    }
}
