/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author imayo
 */import java.util.Scanner;

public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double IVA=0.21;
        Scanner entrada=new Scanner (System.in);
        double x,r1,r2; 
        
       System.out.println("Escribe el precio del producto");
       
       x=entrada.nextFloat();

       r1=x*IVA;
       
       r2=r1+x;
       
       System.out.println("el precio del producto final es:"+r2);
       
       
       
        
        
    }
    
}
