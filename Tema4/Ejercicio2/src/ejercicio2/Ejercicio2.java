/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
//Escribir un programa que reciba como datos una cadena de caracteres y un carácter y reporta el número de veces que se encuentra el carácter en la cadena.
/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio2 {

   public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escriba una palabra/frase");
        frase=entrada.nextLine();
        return frase;
   } 
   public static char obtenercaracter(){
    Scanner entrada=new Scanner (System.in);
    char x;
        System.out.println("Escriba un carácter");
        x=entrada.next().charAt(0);
        return x;
   }
   
   public static int contarcaracter(String frase, char x){
       
       int posicion, cont = 0;
       
        posicion = frase.indexOf(x);
        while (posicion != -1) { 
            cont++;
            posicion = frase.indexOf(x, posicion + 1);
        }
         System.out.println(cont);
        return cont;
       
    }
   
    public static void main(String[] args) {
        String frase;
        char x;
       
        frase=obtenerfrase();
        x=obtenercaracter();
        contarcaracter(frase,x);
    }
    
}
