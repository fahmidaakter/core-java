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
public class Arrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] n = new int[2][3];
        System.out.println("Row 1");
        System.out.println("Enter number");

        n[0][1] = s.nextInt();
        System.out.println("enter number");

        n[0][1] = s.nextInt();
        System.out.println("enter number");

        n[0][2] = s.nextInt();

        System.out.println("Row 2");
        System.out.println("Enter number");

        n[1][0] = s.nextInt();
        System.out.println("enter number");

        n[1][1] = s.nextInt();
        System.out.println("enter number");

        n[1][2] = s.nextInt();
        System.out.println("Data table");
        sortingArray(n);

    }

    public static void sortingArray(int[][] n) {
        for (int[] d : n) {
            java.util.Arrays.sort(d);

            for (int a : d) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

}
