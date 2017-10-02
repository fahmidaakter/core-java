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
public class App2 {

    public static void main(String[] args) {
        Father father = new Father();
        Child son = new Child();

        father.setName("x");
        son.setAge(9);
        son.setIncome(2000000);
        System.out.println("Father name:" + father.getName() + "wealth:" + father.property(50000000));
        System.out.println("son age" + son.getAge() + "House RENT"
                + son.house(2000000)
                + "income" + son.getIncome()
                + "son welth" + son.income(100000000));

    }

}
