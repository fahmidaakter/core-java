/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.Evidence;

import java.util.Scanner;

import java.util.Arrays;

/**
 *
 * @author J2EE-33
 */
public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        
        System.out.println("min num:  " + minSort(arr));
        System.out.println("max num:  " + maxSort(arr));
    }

    public static int minSort(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

    public static int maxSort(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }
}
