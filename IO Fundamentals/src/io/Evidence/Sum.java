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
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int sn=s.nextInt();
 Scanner l = new Scanner(System.in);
        System.out.println("Enter Second number: ");
        int en=l.nextInt();
        calculateSum(sn,en);
    }
    public static void calculateSum (int sn, int en){
        int sum  = 0;
        if(sn <en ){
        for(int i = sn; i <=en; i++){
        sum +=i;
        }
        }else{
        for (int i =sn; i>=en; i--){
        sum +=i;
        }
        }
        System.out.println("Sum: "+sum );
    }
    
}
