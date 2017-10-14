/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingthread.CreatingThreadcom.google.join;

/**
 *
 * @author J2EE-33
 */
public class MyThread extends Thread {

    public void run() {
      
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                //sleep interrupted
            }
             System.out.println("Thread is running:....." );
        
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
       
    }
    

}
