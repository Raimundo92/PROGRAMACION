/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Sheila
 */

public class Ejercicio3 {
    
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

    public static void main(String[] args) {
        int n = 5;
        boolean iguales;
        float[] array1 = new float[n];
        float[] array2 = new float[n];
        System.out.println("Rellenemos el primer vector");
        array1 = valorarray(array1);
        System.out.println("Rellenemos el segundo vector");
        array2 = valorarray(array2);

        iguales = Arrays.equals(array1, array2);
        if (iguales) //si pongo if (iguales==true) (es lo mismo)
        {
            System.out.println("los vectores son iguales");
        } else {
            System.out.println("los vectores no son iguales");
        }
    }

}
