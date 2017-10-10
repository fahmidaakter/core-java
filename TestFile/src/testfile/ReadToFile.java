/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author J2EE-33
 */
public class ReadToFile {

    public static void main(String[] args) throws Exception {
        String srcFile = "my_second_file.txt";
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        String text = null;
        String lines = "";
        while ((text = br.readLine()) != null) {
            System.out.println(text);
            lines += text + " ";
        }
        System.out.println("lines: " + lines);

        if (lines.contains("Dhakacc")) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }

        br.close();
    }

}
