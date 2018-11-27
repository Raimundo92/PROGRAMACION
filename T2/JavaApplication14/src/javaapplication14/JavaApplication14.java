/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author imayo
 */import java.util.Scanner;
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        
       int x;
        
        
        System.out.println("escribe un día de la semana");
        
       x=entrada.nextInt();
       
       if ((x==1) || (x==2) || (x==3) || (x==4) || (x==5))
               
               System.out.println("Es día laboral");
       else 
           System.out.println("no es laboral");
       
       
       
     
         
       
       
       
       
    }
    
}
