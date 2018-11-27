/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7sinmetodo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Ejercicio7sinmetodo {

    public static int obtenertamaño(){
    Scanner entrada=new Scanner (System.in);
    int n;
        System.out.println("escribe el tamaño del vector");
        n=entrada.nextInt();
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

    public static void comparacion(float[] array1, float[] array2) {
        
        int i;
        for (i = 0; i <= array1.length - 1; i++) {

                System.out.print("En la celda " + (i + 1) + ": ");
                if (array1[i] == array2[i]) {
                    System.out.println("es igual en los dos vectores, cuyo número es " + array1[i]);
                } else if (array1[i] > array2[i]) {
                    System.out.println("el primer vector con número " + array1[i]
                            + " es mayor que el vector 2º cuyo valor es " + array2[i]);
                } else {
                    System.out.println("el primer vector con número " + array1[i]
                            + " es menor que el vector 2º cuyo valor es " + array2[i]);

                }
            }
    }

    public static void main(String[] args) {
        int n;
        n=obtenertamaño();
        float[] array1 = new float[n];
        float[] array2 = new float[n];
        System.out.println("Rellenemos el primer vector");
        array1 = valorarray(array1);
        System.out.println("Rellenemos el segundo vector");
        array2 = valorarray(array2);

        comparacion(array1, array2);
    }
}
