/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author J2EE-33
 */
public class GenSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("second");
        set.add("3rd");
        //this line generates compile error
        //set.add(new Integer(4));
        set.add("second");
        System.out.println(set);
    }

}
