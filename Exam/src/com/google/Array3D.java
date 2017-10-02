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
public class Array3D {
    public static void main(String[] args) {
        int [][][] array3D ={
            {{1,1,1},{2,4,6},{4,5,6}},
            {{1,2,3},{3,4,5},{5,7,8}}
        };
      for (int[][] array2D : array3D) {
    for (int [] array1D : array2D){
    for (int item : array1D){
        System.out.print(" "+item);
    }
        System.out.println(" ");
    }
    }         
    }
    
}
