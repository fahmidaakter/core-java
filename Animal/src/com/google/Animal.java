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
public interface Animal {
    //all method of interface are abstruct  by default  
    //like public abstract void eat();
    // interface abstract method can not have body
    public void eat();
     public void drink();
      public void run();
       public void walk();
        public void sleep();
         public void bite();
}
