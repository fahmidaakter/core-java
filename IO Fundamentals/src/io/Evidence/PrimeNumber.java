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
public class PrimeNumber {

    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        m = n / 2;
        if (m == 0 || n == 1) {
            System.out.println("Number is not prime ");
            flag = 1;

        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Number is not prime");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Number is  prime");
        }
    }

}
