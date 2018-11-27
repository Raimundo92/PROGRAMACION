/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11otraforma;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio11otraforma {

    public static String obtenerfrase(){
    Scanner entrada= new Scanner (System.in);
    String frase;
        System.out.println("introduce una palabra/frase");
    frase=entrada.nextLine();
    return frase;
    }
    
    public static void copiar(char[] array1, char[]array2){
       System.arraycopy(array1, 0, array2, 0, array1.length);
    
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array2[i]);
         }
    }
    public static void main(String[] args) {
      String frase;
      frase=obtenerfrase();
      char[] array1=frase.toCharArray();
      char[] array2=new char[array1.length];
      copiar(array1,array2);
    }
  }