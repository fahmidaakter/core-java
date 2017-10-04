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
public class MapExample {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("one", "1st");
        map.put("second", new Integer(2));
        map.put("third", "3rd");
        map.put("third", "III");
        Set set1 = map.keySet();
        Collection collection = map.values();
        Set set2 = map.entrySet();
        System.out.println(set1 + "\n" + collection + "\n" + set2);

    }

}
