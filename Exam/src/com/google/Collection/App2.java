/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.Collection;

import java.util.HashSet;

/**
 *
 * @author J2EE-33
 */
public class App2 {
    
    public static void main(String[] args) {
        People p1 = new People("Afrah", 50000, Country.BANGLADESH);
        People p2 = new People("Fahmida", 40000, Country.INDIA);
        People p3 = new People("momin", 57000, Country.JAPAN);
        People p4 = new People("Tuli", 20800, Country.UK);
        People p5 = new People("Afrah", 50000, Country.BANGLADESH);
        People p6 = new People("Ayyat", 90000.0, Country.BANGLADESH);
       HashSet<People> peopleSet = new HashSet<>();
        peopleSet.add(p1);
        peopleSet.add(p2);
        peopleSet.add(p3);
        peopleSet.add(p4);
        peopleSet.add(p1);
        peopleSet.add(p6);
        System.out.println("Name: " + "Salary: " + "Country: ");
        for (People p : peopleSet) {
            if (p.getCountry().equals(Country.BANGLADESH) && p.getSalary() > 30000) {
                System.out.println("  " + p.getName() + "  " + p.getSalary() + "   " + p.getCountry());

            }
        }
    }
    
}
