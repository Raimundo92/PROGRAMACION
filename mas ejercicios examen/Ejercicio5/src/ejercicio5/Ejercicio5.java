/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void valores(int[] vector) {

        Random n = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = n.nextInt(100);
        }
    }

    public static int numero() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Escriba un valor entero");
        n = entrada.nextInt();
        return n;
    }

    public static void comprobardivisible(int[] array, int x) {
        int i;
        int j;
        if (x == 0) {
            System.out.println("Ningún número es divisible entre cero");
        } else {
            System.out.println("Éstos son los elementos divisibles de " + x);
            for (j = 0; j < array.length; j++) {
                if (array[j] % x != 0) {
                    System.out.println(array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int x;
        int[] array = new int[n];
        valores(array);
        x = numero();
        comprobardivisible(array, x);
    }

}
