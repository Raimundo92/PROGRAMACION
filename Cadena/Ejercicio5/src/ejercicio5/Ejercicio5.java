/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static String obtenerfrase() {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Escribe la palalbra/frase");
        frase = entrada.nextLine();
        return frase;
    }

    public static void sustituir(char[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                array[i] = '-';
            }

        }
        System.out.println(array);
        }
   
    public static void sinespacios(char[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                array[i] = array[i + 1];
            }
            
        }
        System.out.println(array);
    }

    public static void main(String[] args) {
        String frase;
        frase = obtenerfrase();
        char[] array = frase.toCharArray();
        char[] array2=frase.toCharArray();
        sustituir(array);
        sinespacios(array2);
    }

}
