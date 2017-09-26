
package com.employee.newpackage;

public class test {
   
    public static void main(String[] args){
    int x=8;
    boolean result=x>7;
    boolean result2= x>=7;
    System.out.println("result-> "+result);
     System.out.println("result2-> "+result2);
     
     ConCat firstresult=new ConCat();
     ConCat2 secontresult=new ConCat2();
     
        System.out.println(firstresult.getConcatResult("Mr", "Shamim", "Sarkar"));
     secontresult.getConcatResult("Mr", "Shamim", "Sarkar");
    }
}
