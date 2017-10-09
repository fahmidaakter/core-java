/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author J2EE-33
 */
public class WriteToFile {

    public static void main(String[] args) {
        String destFile = "my_second_file.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {

            bw.append("Dhaka");
            bw.newLine();
            bw.append(" is");
            bw.newLine();
            bw.append("the");
            bw.newLine();
            bw.append("capital");
            bw.flush();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            System.out.println("writing done.");
        }
    }

}
