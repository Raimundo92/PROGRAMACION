/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author imayo
 */

public class Ejercicio5 {
    
    
public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escriba una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    }
    

    public static void main(String[] args) {
    String frase=obtenerfrase();
    frase=frase.replace(" ","");
    System.out.println(frase);
    }
    
}
