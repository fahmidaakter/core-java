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
public class DoWhileloop {

    private static int sn = 1;
    private static int en = 10;
    private static int sum = 0;

    public static void main(String[] args) {
        System.out.println(makeSum(sn, en));
    }

    public static int makeSum(int x, int y) {
        do {
            sum += x;
            x++;

        } while (x <= y);

        return sum;
    }
}
