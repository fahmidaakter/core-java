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
public class PositiveNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        System.out.println("Enter numbeer");
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        n[3] = sc.nextInt();
        System.out.println("Sum : " + calNum(n));
    }

    public static int calNum(int[] args) {
        int arg = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] > 0) {
                arg += args[i];
            }
        }
        return arg;
    }
}
