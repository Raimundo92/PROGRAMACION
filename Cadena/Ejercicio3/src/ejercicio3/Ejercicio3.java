/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
public class Ejercicio3 {

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
    public static void contador(char[] array){
     int numero = 0;
       numero = array.length;
        System.out.println("La palabra tiene "+numero+" letras");
    
    }
    
    public static void main(String[] args) {
        String palabra;
        palabra=obtenerpalabra();
        char[] array=palabra.toCharArray();
        contador(array);
        
    }
    
}
