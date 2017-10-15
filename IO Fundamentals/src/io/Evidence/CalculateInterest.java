/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.Evidence;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class CalculateInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculate interest");
        System.out.println("Please enter principle amount : ");
        float amount = scanner.nextFloat();
        System.out.println("Enter time in years :");
        float time = scanner.nextFloat();

        System.out.println("Enter rate annualy: ");
        float rate = scanner.nextFloat();

        float interest = calculateInterest(amount, rate, time);
        float sudasol = amount + interest;
        System.out.println("Simple intereated : " + interest + " And Sudasol " + sudasol);
    }

    public static float calculateInterest(float principle, float rate, float time) {
        float interest = (principle * rate * time) / 100;
        return interest;
    }
}
