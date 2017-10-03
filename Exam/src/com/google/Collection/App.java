/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Afrah", Gender.FEMALE);
        Person p2 = new Person(2, "Fahmida", Gender.FEMALE);
        Person p3 = new Person(3, "Firoz", Gender.MALE);
        Person p4 = new Person(4, "UMRAN", Gender.MALE);
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        System.out.println("Id   " +"Name     " +"Gender   ");
        for (Person p : personList) {
            if(p.getGender()==Gender.FEMALE){
            System.out.println(" " + p.getId()
           +"  " + p.getName()
            +"  " + p.getGender());
        }
    }
    }
}
