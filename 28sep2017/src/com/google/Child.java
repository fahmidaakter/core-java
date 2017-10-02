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
public class Child extends Father {

    private int age;
    private double income;
    private double property = property(50000000);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double house(double i) {
        property = property - i;
        return property;
    }

    public double income(double i) {
        property += i;
        return property;
    }

}
