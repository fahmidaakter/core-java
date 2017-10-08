/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author J2EE-33
 */
public class TestGenerics {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("joy");
        //list.add(32);//compile time error

        String s = list.get(1);//type casting is not required
        System.out.println("element is : " + s);

        /* Iterator<String>itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }*/
        for (String p : list) {
            System.out.println(p);
        }
    }
}
