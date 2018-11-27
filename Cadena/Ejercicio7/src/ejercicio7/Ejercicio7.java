/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    
    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;    
    System.out.println("Escriba una palabra");
    frase=entrada.nextLine();
    return frase;
    }
    public static void contador(char[] array){
    int i;
    int contador=0;
        for (i = 0; i < array.length; i++) {
            
            contador=contador+1;   
        }
        System.out.println(contador);
        System.out.println(array.length); //más facil de otra forma
    }
    
    public static void main(String[] args) {
      String frase;
      frase=obtenerfrase();
      char[] array=frase.toCharArray();
      contador(array);
    }
    
}
