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
public class Exam {

    private String x = "10";
    private int y = 5;
    private int result = 0;

    public Exam() {
    }

    public int addf(String a, int b) {
        result = Integer.parseInt(a) + b;
        return result;
    }

    public int subtruc(String a, int b) {
        result = Integer.parseInt(a) - b;
        return result;
    }

    public int multiply(String a, int b) {
        result = Integer.parseInt(a) * b;
        return result;
    }

    public int divide(String a, int b) {
        result = Integer.parseInt(a) / b;
        return result;
    }

    public static void main(String[] args) {
        int y=15;
        Exam exam = new Exam();
        System.out.println("Sum : " + exam.addf("10", 5));
        System.out.println("Sub : " + exam.subtruc("10", 5));
        System.out.println("Multiply : " + exam.multiply("10", 5));
        System.out.println("Division  : " + exam.divide("10", 5));
        
        System.out.println("Y as string: "+ Integer.toString(y));
    }

}
