/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static String obtenerfrase(){
    String palabra;
    Scanner entrada=new Scanner (System.in);
    System.out.println("Introduce una palabra");
    palabra=entrada.nextLine();
    return palabra;
    }
    public static void union(char[]array1, char[] array2){
      int i;
      int j;
        for (i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        
        for (j = 0; j < array2.length; j++) {
            if (j==0){
                System.out.print(" ");
            }           
            System.out.print(array2[j]);
        }
  
        
        }
    public static void main(String[] args) {
        String palabra1;
        String palabra2;
        
       palabra1=obtenerfrase();
       palabra2=obtenerfrase();
             
       char[] array1=palabra1.toCharArray();
       char[] array2=palabra2.toCharArray();
       union(array1,array2);
       
       
    }
    
}
