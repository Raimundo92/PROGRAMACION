/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static String obtenerpalabra(){
    Scanner entrada=new Scanner(System.in);
    String palabra;
        System.out.println("escribe una palabra");
        palabra=entrada.nextLine();
        return palabra;
    }
    public static void ordenar(char[] array){
     int i;
       Arrays.sort(array);
        for ( i=0; i<array.length;i++) {
            System.out.println(array[i]);
            }
    }
    
    public static void main(String[] args) {
        String palabra;
        palabra=obtenerpalabra();
        char[] array=palabra.toCharArray();
        ordenar(array);
       }
        
}
