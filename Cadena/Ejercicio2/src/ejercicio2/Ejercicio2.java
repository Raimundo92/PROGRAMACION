/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static String obtenerFrase() {
        String frase;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = entrada.nextLine();
        return frase;
    }

    public static void convertir(char[] array) {
        if (array[array.length - 2] =='s'){
            array[array.length - 2] =' ';
        }
        else 
            if (array[array.length -2]!='s'){
            array[array.length-1]='s';
        }
         
    }
    public static void main(String[] args) {
        String frase;
        frase = obtenerFrase();
        frase=frase+ " ";
        char[] array = frase.toCharArray();
        
        convertir(array);
        frase=new String(array);
        System.out.println(frase);
    }

}
