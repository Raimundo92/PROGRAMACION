/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
//Hacer un programa que ingrese una cadena de caracteres y determine el número de mayúsculas y el número de minúsculas.

import java.util.Scanner;

public class Ejercicio1 {
  
    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escriba una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    }
    public static void contarletras(String frase){
    char[] array = frase.toCharArray();
    int i, contamayus=0,contaminus=0;
        for (i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i])){
            contaminus++;
            }
            if (Character.isUpperCase(array[i])){
            contamayus++;
            }
        }
        System.out.println("Las mayúscuas son: "+contamayus+" Las minúsculas podemos contar"+contaminus);
    }
    public static void main(String[] args) {
        String frase;
        frase=obtenerfrase();
        contarletras(frase);
        
        
    }
    
}
