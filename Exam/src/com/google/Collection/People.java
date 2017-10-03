/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.Collection;

/**
 *
 * @author J2EE-33
 */
public class People {

    private String name;
    private double salary;
    private Country Country;

    public People(String name, double salary, Country Country) {
        this.name = name;
        this.salary = salary;
        this.Country = Country;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Country getCountry() {
        return Country;
    }

    

}
