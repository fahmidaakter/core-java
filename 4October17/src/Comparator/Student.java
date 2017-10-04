/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;

/**
 *
 * @author J2EE-33
 */
public class Student {

    String firstName, lastName;
    int StudentID;
    double GPA = 0.0;

    public Student(String firstName, String lastName, int StudentID, double GPA) {

        if (firstName == null || lastName == null || StudentID == 0 || GPA == 0.0) {
            throw new IllegalArgumentException();
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.StudentID = StudentID;
        this.GPA = GPA;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int studentID() {
        return StudentID;
    }

    public double GPA() {
        return GPA;
    }


}
