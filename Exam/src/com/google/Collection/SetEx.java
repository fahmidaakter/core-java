/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author J2EE-33
 */
public class SetEx {
    public static void main(String[] args) {
     Set set = new HashSet<>();
     set.add("one");
     set.add("second");
     set.add("3rd");
     set.add(new Integer (4));
     set.add(new Float (5.0F));
     set.add("second");
     set.add(new Integer(4));
        System.out.println("Set: "+ set );
    }
 
}
