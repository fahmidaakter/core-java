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
public class OuterClass {

    public int x = 0;
    
    class InnerClas {

        public int x = 1;

        void methodInInnerClas(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("OuterClass.this.x = " + OuterClass.this.x);
        }
    }

    public static void main(String[] args) {
        OuterClass st = new OuterClass();
        OuterClass.InnerClas fl = st.new InnerClas();
        fl.methodInInnerClas(23);
        
    }
    
}
