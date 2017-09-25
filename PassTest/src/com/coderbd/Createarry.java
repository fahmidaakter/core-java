/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.util.Arrays;

/**
 *
 * @author J2EE-33
 */
public class Createarry {

    public String  createarry() {
        char[] s;
        s = new char[26];
        for (int i = 0; i <26; i++) {
            s[i] = (char) ('A' + i);
        }
        return Arrays.toString(s)+" ";

    }
    public static void main(String[] args) {
        Createarry abc = new Createarry();
        System.out.println(abc.createarry());
    }
}