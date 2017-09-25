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
public class Arry {

    private int[] x={4,5,6};
    private static int y[];
    public static void main(String[] args) {
        y=new int[3];
        y[0]=5;
        y[1]=4;
        y[2]=5;
        System.out.println(y.length);
        for(int i:y){
            System.out.println(i);
        }
    }
    

}
