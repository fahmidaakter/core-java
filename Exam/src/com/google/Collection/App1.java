/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.Collection;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class App1 {

    public static void main(String[] args) {
        People p1 = new People("Afrah", 50000, Country.BANGLADESH);
        People p2 = new People("Fahmida", 40000, Country.INDIA);
        People p3 = new People("momin", 57000, Country.JAPAN);
        People p4 = new People("Tuli", 20800, Country.UK);
        People p5 = new People("Rakib", 30800, Country.BANGLADESH);
        People p6 = new People("Ayyat", 90000.0, Country.BANGLADESH);
        List<People> peopleList = new ArrayList<>();
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p4);
        peopleList.add(p5);
        peopleList.add(p6);
        System.out.println("Name: " + "Salary: " + "Country: ");
        peopleList.stream().filter((p) -> (p.getCountry().equals(Country.BANGLADESH) && p.getSalary() > 30000)).forEachOrdered((p) -> {
            System.out.println("  " + p.getName() + "  " + p.getSalary() + "   " + p.getCountry());
        });
    }
}
