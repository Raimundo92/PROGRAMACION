/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Ejercicio9 {

     

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

    public static void comparacion(float[] array1) {
       int contador0=0;
       int contadorneg=0;
       int contadorpos=0;
        
        int i;
        for (i = 0; i <= array1.length - 1; i++) {

                System.out.print("En la celda " + (i + 1) + ": ");
                if (array1[i] == 0) {
                    contador0=contador0+1;
                    System.out.println("Hay "+contador0+" ceros");
                    
                } else if (array1[i] <0) {
                    contadorneg=contadorneg+1;
                    System.out.println("Hay "+contadorneg+" números negativos");
                } else {
                    contadorpos=contadorpos+1;
                    System.out.println("Hay "+contadorpos+" números positivos");

                }
            }
    }

    public static void main(String[] args) {
        int n=10;
        float[] array1 = new float[n];
        System.out.println("Rellenemos el primer vector");
        array1 = valorarray(array1);
        comparacion(array1);
    }
}
