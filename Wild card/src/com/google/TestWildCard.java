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
public class TestWildCard {

    public static void main(String[] args) {
        List<A> listA = new ArrayList<A>();
        listA.add(new A("Rahim"));
        processElements(listA);

        List<B> listB = new ArrayList<B>();
        listB.add(new B(30000.0));
        listB.add(new B(50000.0));
        processElements(listB);

        List<A> listAc = new ArrayList<A>();
        listAc.add(new A("Atik"));
        processElementsBitDifferent(listAc);

    }

    public static void processElements(List<?> elements) {
        for (Object o : elements) {
            System.out.println(o);
        }
    }

    public static void processElementsBitDifferent(List<? extends A> elements) {
        for (A a : elements) {
            System.out.println(a);

        }
    }

}
