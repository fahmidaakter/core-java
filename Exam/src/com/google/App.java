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
public class App {
    public static void main(String[] args) {
        Student student = new Student("Fahmida",33);
        System.out.println("Name : "+ student.getName());
        System.out.println("Roll : "+ student.getRollNumber());
    }
    
}
