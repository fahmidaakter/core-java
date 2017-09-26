/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googlel;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Cat();
        Animal a3 = new Mini();
        Animal a4 = new Kiti();

        Cat c = new Cat();
        Cat c1 = new Mini();
        Cat c2 = new Kiti();

        Mini mini = new Mini();
        Mini m = new Kiti();

        Kiti kiti = new Kiti();

        Animal animal = a;
        Animal animal1 = a1;
        Animal animal2 = a3;
        Animal animal3 = a4;

        Cat cat1 = (Cat) animal;
        Cat cat2 = c;
        Cat cat3 = c1;
        Cat cat4 = c2;
        
        Mini m1=(Mini) c1;
        Mini  m2 = m;
        Mini  n= mini;
        Mini  nn=(Mini) a3;
        
        Kiti k1=(Kiti) a4;
        Kiti k2=(Kiti) c2;
        Kiti k3=(Kiti) m;
        Kiti k4= kiti;
        
        

    }

}
