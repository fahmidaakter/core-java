/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */
public class TestArgs {


    public static void main(String[] args) {
        
        args = new String[5];
        args[0]="jakir";
         args[1]="parvage";
          args[2]="sohan";
           args[3]="samim";
            args[4]="sabib";
       
        for(int i=0; i<args.length; i++){
            System.out.println("args [ "+ i+ "] is '" + args[i]+ "'");
        }
    }
    
}
