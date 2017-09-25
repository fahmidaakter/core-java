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
public class Manager extends Employee {

    public String departmentName;

    public Manager(String name, String departmentName, double salary) {
        super(name, salary);
        this.departmentName = departmentName;
    }

    

    public String getDetails() {
        return "from manager{"
                + "name=" + name + ","
                + "departmentName=" + departmentName + ","
                + " salary=" + salary + '}';
    }

}
