/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author examendam
 */
public class Ejercicio2 {

    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Introduce una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    }
    public static void introducir(char[]vector, char[]vector2){
    
    int contadorj=0;
    int i;
    
        for (i = vector.length-1; i >=0; i--) {
            vector2[contadorj]=vector[i];
            contadorj++;
            
        }
       //Hemos implementado el vector de forma contraria al vector2. De forma que el vector2 quedaría de forma al reves con respecto al vector1.
        if(Arrays.equals(vector, vector2)){
            System.out.println("Es palindromo");
        }
        else{
            System.out.println("No es palindromo");
        }
    } 
     
    public static void main(String[] args) {
        String frase;
        frase=obtenerfrase();
        char[]array=frase.toCharArray();
        
        char[] array2=new char[array.length];
        introducir(array,array2);
          
        
        
    }
    
}
