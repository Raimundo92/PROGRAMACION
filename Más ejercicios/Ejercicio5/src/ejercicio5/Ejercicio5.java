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

    public static int obtenerarray() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Escribe la dimensión");
        n = entrada.nextInt();
        return n;
    }

    public static void cambiarElemento(int[] array) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Escribe valores");
        for (i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt();
        }
    }

    public static int calculesuma(int[] array) {
        int i;
        int suma = 0;
        for (i = 0; i < array.length; i++) {
            suma=suma+array[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        int n;
        int suma;
        n = obtenerarray();
        int[] array = new int[n];
        cambiarElemento(array);
        suma = calculesuma(array);
        System.out.println("La suma del array es"+suma);
    }

}
