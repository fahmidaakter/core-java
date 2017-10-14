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
public class TestThreadYield implements Runnable {

    Thread t;

    TestThreadYield(String str) {
        t = new Thread(this, str);
        //this will call run() function
        t.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            //yields control to another thread every 5 iterations
            if ((i % 5) == 0) {
    System.out.println(Thread.currentThread().getName()
                        + "  yielding control...");
                /*causes the currently executing thread object to temporally
           pause and allow other threads to execute*/
                Thread.yield();

            }
        }
        System.out.println(Thread.currentThread().getName() + "has finished executing");
    }

}
