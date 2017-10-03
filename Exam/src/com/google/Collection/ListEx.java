/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.Collection;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author J2EE-33
 */
public class ListEx {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("second");
        list.add("3rd");
        list.add(new Integer(4));
        list.add(new Float(5.0F));
        list.add("second");
        list.add(new Integer(4));
        System.out.println("Set: " + list);
    }
}
