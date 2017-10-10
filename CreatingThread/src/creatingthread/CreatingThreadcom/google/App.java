/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingthread.CreatingThreadcom.google;

/**
 *
 * @author J2EE-33
 */
public class App {

    public static void main(String[] args) {
        Uncle uncle = new Uncle();
        Thread uncleThread = new Thread(uncle);
        uncleThread.setName("jamil");
        uncleThread.start();

        Urmi urmi = new Urmi();
        Thread urmiThread = new Thread(urmi);
        urmiThread.setName("Urmi");
        urmiThread.setPriority(10);
        urmiThread.start();

        System.out.println("uncleThread Name " + uncleThread.getName());
        System.out.println("urmiThread Name " + urmiThread.getName());

        System.out.println("uncleThread Priority " + uncleThread.getPriority());
        System.out.println("urmiThread Priority " + urmiThread.getPriority());
    }
}
