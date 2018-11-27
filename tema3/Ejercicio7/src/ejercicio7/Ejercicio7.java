/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Ejercicio7 {

    public static int obtenertamaño() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("escribe el tamaño del vector");
        n = entrada.nextInt();
        return n;
    }

    public static float[] valorarray(float[] array) {
        Scanner entrada = new Scanner(System.in);
        int i;

        for (i = 0; i <= array.length - 1; i++) {
            System.out.println("escribe valor para el vector");
            array[i] = entrada.nextFloat();
            System.out.println(array[i]);
        }
        return array;
    }

    public static void paresono(float[] array1) {
        int i;
        for (i = 0; i <= array1.length - 1; i++) {

            System.out.print("En la celda " + (i + 1) + ": ");
            if (array1[i] % 2 == 0) {

                System.out.println("Es par en la celda");

            } else {
                System.out.println("Es impar en la celda");
            }

        }
    }

    public static void main(String[] args) {
        int n;
        int i;
        n = obtenertamaño();
        float[] array1 = new float[n];
        array1 = valorarray(array1);
        Arrays.sort(array1);
        System.out.println("");
        for (i = 0; i <= array1.length - 1; i++) {
            System.out.println(array1[i]);
        }
        paresono(array1);
    }
}
