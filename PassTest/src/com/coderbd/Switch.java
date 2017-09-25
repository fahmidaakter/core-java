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
public class Switch {

    private static int x = 2;

    public static int add(int value) {
        x += value;
        return x;
    }

    public static int substruct(int value) {
        x -= value;
        return x;
    }

    public static void main(String[] args) {
        switch (x) {
            case 1:
                System.out.println("x: " + x);
                System.out.println("After add 11: " + add(11));
                System.out.println("After minus 6: " + substruct(6));
                break;
            case 2:
                System.out.println("x: " + x);
                System.out.println("After add 15: " + add(15));
                System.out.println("After minus 3: " + substruct(3));
                break;
            default:
                System.out.println("no matching");

        }
    }
}
