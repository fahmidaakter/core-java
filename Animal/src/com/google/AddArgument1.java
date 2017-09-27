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
public class AddArgument1 {
    public static void main(String[] args) {
        int sum = 0;
        for ( int i=0; i< args.length; i++){
        try{
        sum+= Integer.parseInt(args[i]);
        }catch (NumberFormatException nfe){
            System.err.println("[" +args[i] + "] is not an integer"+ "and will not be included in the sum.");
        }
        }
        System.out.println("sum =" +sum );
    }
}
