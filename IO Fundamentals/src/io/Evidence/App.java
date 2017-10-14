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
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your written number: ");
        int writtennumber =sc.nextInt();
         System.out.println("Enter your evidence number: ");
           int evidence =sc.nextInt();
           int total = writtennumber + evidence;
        PassFail result =new PassFail(writtennumber,evidence);
        System.out.println(result.result()+"  Total marks: "+ total  +" Grade: "+ result.resultGread());
    }
    
}
