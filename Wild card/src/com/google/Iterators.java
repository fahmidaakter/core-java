/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.util.*;

/**
 *
 * @author J2EE-33
 */
public class Iterators {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Urmi"));
        list.add(new Student("fahmi"));
        list.add(new Student("uma"));
        list.add(new Student("Uruiooi"));
        Iterator<Student> elements = list.iterator();
        while (elements.hasNext()) {
            System.out.println(" " + elements.next().getName());
        }
    }
}
