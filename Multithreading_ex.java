/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw7;

/**
 *
 * @author bolua
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Multithreading_ex extends JFrame{

/* GUI components that get input from the user
   */
 private JPanel panel = new JPanel();
 JTextArea repittions= new JTextArea(1,1);
 JLabel label = new JLabel();
 JButton startbutton = new JButton("START");
 JTextArea getthreads = new JTextArea(1,1);
 JLabel repis = new JLabel("Enter how many threads");
 
 JLabel delay = new JLabel("Enter the delay time");
 JTextArea delayare = new JTextArea(1,1);
 
   
  
  //for the purpose of converting the string input into integers
  String Userresponse;
  static Integer num_reps;
  String delays;
  static Integer yy;
  String threadds;
 static Integer num_threads;
 static String print;
       
 public Multithreading_ex() {
     this.setVisible(true);
     this.setSize(400,400);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(true);
     this.add(panel);
     
    
     panel.add(label);
     label.setText("Enter number of repititions: ");
     panel.add(repittions);
     
    
     panel.add(repis);
    
     panel.add(getthreads);
     
     
     panel.add(delay);
     panel.add(delayare);
     panel.add(startbutton);
     startbutton.addActionListener(new Action());
    
     
    
 }
    
    public static void main(String[] args) {
   
        Multithreading_ex ex1 = new Multithreading_ex();
        
      



     
}
    
    /* using an actionlistener to get the 
    repititons,number of threads, and the delay from the user
    */
    public class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
         //gets the number the user enters for number of repititions
             Userresponse = repittions.getText();
             num_reps = Integer.parseInt(Userresponse);
             
              //gets the number the user enters for number of delays
             delays = delayare.getText();
    yy = Integer.parseInt(delays);
    
    //gets the number the user enters for number of threads
    threadds = getthreads.getText();
        num_threads = Integer.parseInt(threadds);
   //creating the runnable and thread arrays to be looped
   GreetingRunnable runarr1[] = new GreetingRunnable[num_threads];  
   Thread thread1[] = new Thread[num_threads];
        
       
  //first for loop prints the output however many times the user wishes    
for(int i=0;i<num_reps;i++){

    //second for loop creates the user specified number of threads
    for (int j=0;j<num_threads;j++) {
  
runarr1[j] =new GreetingRunnable("Hello from thread #",j);


thread1[j] = new Thread(runarr1[j]);

thread1[j].start();


   
    try {
        Thread.sleep(yy);
    } catch (InterruptedException ex) {
        Logger.getLogger(Multithreading_ex.class.getName()).log(Level.SEVERE, null, ex);
    }
        
      catch (Exception ex) {}
      
      
    
    
    }
        
        
        
        
        
        
        
}

        }
        
    }
    






}

    
