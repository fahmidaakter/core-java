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
public class Array2d {

    public static void main(String[] args) {
        int[][] array2D = new int[2][3];
        
        
        array2D[0][0] = 1;
        array2D[0][1] = 3;
        array2D[0][2] = 5;
        array2D[1][0] = 2;
        array2D[1][1] = 6;
        array2D[1][2] = 9;
        for(int[] array1D : array2D){
            for (int item : array1D){
                System.out.print(" "+item);
            }
            System.out.println("");   
        
        }

    }

}
