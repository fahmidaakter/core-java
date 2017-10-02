/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

/**
 *
 * @author J2EE-33
 */
public class AnonymousInterfaceDemo {

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void bite() {
                System.out.println("Animal can bite");
            }

            @Override
            public void run() {
                System.out.println("Animal can run.");
            }
        };
        animal.bite();
        animal.run();
    }

}
