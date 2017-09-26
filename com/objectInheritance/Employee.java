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
public class Employee {

   public  String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

 
    public String getDetails() {
        return "from Employee{"
                + "name=" + name + ","
                + " salary=" + salary + '}';
    }

  
    

    
    
   
    
    
}
