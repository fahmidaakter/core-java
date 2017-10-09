/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author J2EE-33
 */
public class TestFile {

    public static void main(String[] args) throws IOException {
        
        File newFile = new File("my_new_file.doc");
        File newFile2 = new File("my_new_file.txt");
       

        boolean fileCreated = newFile.createNewFile();
        if (!fileCreated) {
            System.out.println(newFile + "could not be created");
        }
        printFileDetails(newFile);
        
        newFile2.delete();
        System.out.println("After deleting new file");
        printFileDetails(newFile);
        
        newFile.createNewFile();
        System.out.println("Create file");
         printFileDetails(newFile);
         
          newFile.createNewFile();
        System.out.println("Create file");
         printFileDetails(newFile);
         
         newFile.deleteOnExit();
         System.out.println("Delete on exit");
         printFileDetails(newFile);
         
         File firstFile = new File("my_first_file.txt");
         File secondFile = new File("my_second_file.txt");
         
         boolean fileCreated1 = firstFile.createNewFile();
         if(fileCreated || firstFile.exists()){
             printFileDetails(firstFile);
                printFileDetails(secondFile);
                boolean renamedFlag = firstFile.renameTo(secondFile);
                if(!renamedFlag){
                    System.out.println("count not renamed "+ firstFile);
                }
                printFileDetails(firstFile);
                  printFileDetails(secondFile);
         }
    }

    public static void printFileDetails(File f) {
        System.out.println("Absolute Path : " + f.getAbsoluteFile());
        System.out.println("File exists : " + f.exists());
    }
}
