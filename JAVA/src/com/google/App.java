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
        Manager manager = new Manager("urmi", "software", 30000.00);
        System.out.println(manager.getDetails());
        Employee e = new Manager("urmi", "software", 30000.00);

        System.out.println(e.getDetails());
        Employee employee = new Employee("urmi", 30000.00);
        System.out.println(employee.getDetails());
    }
}
