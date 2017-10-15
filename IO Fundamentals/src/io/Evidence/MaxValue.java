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
public class MaxValue {
       public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        arr[2] = sc.nextInt();

        arr[3] = sc.nextInt();

        arr[4] = sc.nextInt();
        System.out.println("Max number : " + getMaxValue(arr));

    }
    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
