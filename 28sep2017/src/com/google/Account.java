/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

public class Account implements Balance {
    private double amount;
    private double balance=500000.0;

    @Override
    public void deposite(double amount) {
    balance+=amount;    
    }

    @Override
    public void withdraw(double amount) {
     balance-=amount;  
    }

    @Override
    public double checkBalance() {
       return balance; 
    }
 
}
