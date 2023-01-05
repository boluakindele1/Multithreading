/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw7;

import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bolua
 */
public class GreetingRunnable implements Runnable {

private String greeting;
private int x ;
 private static final int REPITITIONS =10;
 private static final int DELAY = 1000;
        
      public GreetingRunnable(String g, int xx) {
          greeting =g;
          x = xx+1;
      
       
      
      }  
        
        
    @Override
    public void run() {
         
    
        Date now = new Date();
System.out.println(greeting + " " + x);
System.out.println("Date: "+now);
    try {      
        Thread.sleep(DELAY);
    } catch (InterruptedException ex) {
        Logger.getLogger(GreetingRunnable.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
    
    
    
    
}
