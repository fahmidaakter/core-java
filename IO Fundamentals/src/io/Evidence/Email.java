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
public class Email {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter email");
        String email = s.nextLine();

        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println("Vaild Email");
        } else {
            System.out.println("Invail Email");
        }

    }

}
