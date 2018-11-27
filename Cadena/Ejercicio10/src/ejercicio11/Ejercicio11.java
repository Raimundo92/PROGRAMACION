/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
import java.util.Arrays;


public class Ejercicio11 {

   public static String obtenerfrase(){
    Scanner entrada= new Scanner (System.in);
    String frase;
        System.out.println("introduce una palabra/frase");
    frase=entrada.nextLine();
    return frase;
    }
    public static int obtenertamaño(char[] array1){
    int i;
    int contador=0;
        for (i = 0; i < array1.length; i++) {
            contador=contador+1;
            
        }
    char [] array2=new char[contador];
        
    return contador;
       
    }
    public static void copiar(char[] array1, char[]array2, int contador){
       System.arraycopy(array1, 0, array2, 0, contador);
    
        for (int i = 0; i < contador; i++) {
            System.out.print(array2[i]);
            
        }
    
        
    }
    public static void main(String[] args) {
       String frase;
       int contador;
      frase=obtenerfrase();
      char[] array1=frase.toCharArray();
      obtenertamaño(array1);
      contador=obtenertamaño(array1);
      char[] array2=new char[contador];
      copiar(array1,array2,contador);
       
         
    }
    
}