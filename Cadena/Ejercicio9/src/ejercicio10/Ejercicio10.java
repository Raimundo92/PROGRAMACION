/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author imayo
 */import java.util.Scanner;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    
    public static String obtenerfrase(){
    Scanner entrada= new Scanner (System.in);
    String frase;
        System.out.println("introduce una palabra/frase");
    frase=entrada.nextLine();
    return frase;
    }
    
    public static char obtenercaracter(){
    char n;
    Scanner entrada=new Scanner (System.in);
        System.out.println("Escribe el carácter que quieres buscar");
        n = entrada.next().charAt(0);
        return n;
    
    }
    public static void contar(char[] array, char n){
    int i;
    int contar=0;
    for (i = 0; i < array.length; i++) {
        if(array[i] == n){
            contar++;
        }
    }
    System.out.println("Las veces en las que se encuentra el carácter '"+n+"' son: "+contar);        
    }
    
    public static void main(String[] args) {
      String frase;
      char n;
      frase=obtenerfrase();
      n=obtenercaracter();
      char arrays[] = frase.toCharArray();
      contar(arrays,n);      
    }
    
}
