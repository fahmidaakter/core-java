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
public class AddArgument {
    public static void main(String[] args) {
        try{
        try{
        args = new String[1];
        args[0] ="10";
            System.out.println("Index: " +args[1]);
        }catch( ArrayIndexOutOfBoundsException e){
            System.out.println("==ArrayIndexOutOfBoundsException e==");
        }
            System.out.println(10/0);
        }catch( ArithmeticException e){
            System.out.println("==ArithmeticException ==");
        }finally{
            System.out.println("FINAL");
        }
    }
    
}
