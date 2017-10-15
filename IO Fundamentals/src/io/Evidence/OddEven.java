/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.Evidence;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n =s.nextInt();
        checkOddEven(n);
    }
    public static void checkOddEven(int n) {
        if(n/2 == 0){
            System.out.println(n+ " number is even");
        }else{
            System.out.println(n+" is Odd number");
        }
        
    }
 
}
