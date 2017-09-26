package com.employee;

public class Employeeapp {

    public static void main(String[] args) {

        Employee emp = new Employee(100, "Atik", new Department("Java"), 50000.0);
        System.out.println("Id: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment().getName());
        System.out.println("Salary: " + emp.getSalary());
    }

}
