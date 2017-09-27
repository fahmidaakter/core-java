/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googlel;

/**
 *
 * @author J2EE-33
 */
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if ((o != null) && (o instanceof MyDate)) {
            MyDate d = (MyDate) o;
            if ((day == d.day) && (month == d.month) && (year == d.year)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.day;
        hash = 41 * hash + this.month;
        hash = 41 * hash + this.year;
        return hash;
    }

   
}
