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
        Student student1 = new Student("Fahmida", "Akter", 1238122, 4.00);
        Student student2 = new Student("Parvaz", "Mia", 1238145, 4.60);
        System.out.println(student1.compareTo(student2));

    }
}
