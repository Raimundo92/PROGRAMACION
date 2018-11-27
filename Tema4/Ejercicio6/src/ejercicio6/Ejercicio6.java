/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

   public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escriba una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    }
   public static int aminus(String frase){
       
       int posicion, contaa = 0;
       
        posicion = frase.indexOf('a');
        while (posicion != -1) { 
            contaa++;
            posicion = frase.indexOf('a', posicion + 1);
        }
         System.out.println(contaa);
        return contaa;
       
    }
    public static int amayus(String frase){
       
       int posicion, contaA = 0;
       
        posicion = frase.indexOf('A');
        while (posicion != -1) { 
            contaA++;
            posicion = frase.indexOf('A', posicion + 1);
        }
        System.out.println(contaA);
        return contaA;
       
    }
    public static void main(String[] args) {
    String frase=obtenerfrase();
    aminus(frase);
    amayus(frase);
    
    }
}
