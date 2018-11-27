/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author imayo
 */
public class Ejercicio9 {

    public static String obtenerfrase() {
        String palabra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        palabra = entrada.nextLine();
        return palabra;
    }

    public static void iguales(char[] array1, char[] array2) {
        boolean iguales;
        int i;
        iguales = Arrays.equals(array1, array2);
        if (iguales) {
            System.out.println("Son iguales");
        } else {
            System.out.println("no son iguales");
        }
        for (i = 0; i < array1.length; i++) {
        }
        System.out.println(array1);
  
        for (i = 0; i < array2.length; i++) {
            
        }
        System.out.println(array2);

    }

    public static void main(String[] args) {
        String palabra1;
        String palabra2;

        palabra1 = obtenerfrase();
        palabra2 = obtenerfrase();

        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();
        iguales(array1,array2);
    }

}
