
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */
public class TestProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
       //properties.list(System.out);
        
        
        
        
        String pro = System.getProperty("java.vendor");
        System.out.println(" "+pro);
    }
    
}
