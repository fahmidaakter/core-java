/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

/**
 *
 * @author J2EE-33
 */
 public class Test {
 public static String output ="";

 public static void foo(int i) {
 try {
 if(i==1) {
 throw new Exception();
 }
 output += "1";
 } catch(Exception e) {
 output += "2";
 return;
 }
 finally {
 output += "3";
     System.out.println(output);
 }
 output += "4";
 }

 public static void main(String args[]) {
 foo(0);
 foo(1);
}
 }
