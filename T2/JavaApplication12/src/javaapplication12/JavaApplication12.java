/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author imayo
 */import java.util.Scanner;
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String p;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("escriba un nombre");
        p=teclado.next();
        System.out.println("bienvenido"+p);
        
    }
    
    
}
