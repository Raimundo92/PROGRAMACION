/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author imayo
 */
public class Ejercicio3 {
    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escriba una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    } 
    public static void meter(char[]array){
    char[] array2= new char [array.length];
    int i;
    int contadorj = 0;
        for (i = array.length-1;  i>=0; i--) {
            
            array2[contadorj]=array[i];
            contadorj++;
           }
        
    palindromo(array,array2);
    } 
    public static void palindromo (char[] array, char[] array2){
                
        if(Arrays.equals(array,array2)) {
            System.out.print(" es palindroma");
        }
        else{
            System.out.println(" no es palindroma");
        }
    }
    public static void main(String[] args) {
       String frase;
       frase=obtenerfrase();
       char[] array = frase.toCharArray();
       
       meter(array);
       
    }
    
}
