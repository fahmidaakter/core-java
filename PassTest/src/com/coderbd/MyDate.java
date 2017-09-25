/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author J2EE-33
 */
public class MyDate {

    //Instance variable declaration
    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public MyDate(MyDate date){
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;

    }
    
     public MyDate addDays(int moreDays){
         MyDate newDate = new MyDate(this);
         newDate.day=newDate.day +moreDays;
         return newDate;
      

    }

    @Override
    public String toString() {
        return "" + day + "-" + month +"-" +year;
    }
     
    
}

