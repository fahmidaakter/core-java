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
public class EnumDemo {
    public static void main(String[] args) {
        Person person= new Person("Urmi", 21, Gender.FEMALE);
        System.out.println("Name:"+ person.getName()
        +"   Age:"+ person.getAge()
        +"   Gender:"+ person.getGender());
    }
    
}
