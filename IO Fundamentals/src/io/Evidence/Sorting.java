/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.Evidence;

import java.util.Arrays;

/**
 *
 * @author J2EE-33
 */
public class Sorting {

    public static void main(String[] args) {
        int[][] data = {
            {10, 50, 15, 30},
            {25, 33, 30, 40},
            {20, 23, 15, 60},
            {45, 30, 40, 44}};
        System.out.println("Data table ");
        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a + " ");
            }
            System.out.println();
        }
    }
}
