/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Prueba {

    public static int tamañomatriz() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Escriba el tamaño de la matriz");
        n = entrada.nextInt();
        return n;
    }

    public static void rellenarmatriz(Integer[][] matriz, int n, int m) {
        int i, j;
        Random numeros = new Random();
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                matriz[i][j] = numeros.nextInt(101);
            }
        }
    }

    public static void ordenar(Integer[][] matriz, int n, int m) {
        Scanner entrada = new Scanner(System.in);
        char respuesta;
        int i, j;
        Integer[] array = new Integer[n];
        System.out.println("Ingrese 'e' para ordenar las filas de mayor a menor o 'a' para ordenar de menor a mayor");
        respuesta = entrada.next().charAt(0);

        for (i = 0; i <n; i++) {
            array = matriz[i];
            if (respuesta == 'a') {
                Arrays.sort(array);
            } else if (respuesta == 'e') {
                Arrays.sort(array, Collections.reverseOrder());
            }
            matriz[i] = array;
        }

        mostrar(matriz);
    }
    public static void numerosdiferentes(Integer[][] matriz, double[]numeros_diferentes){
        numeros_diferentes[0]=matriz[0][0];
        int contador=1;
        for (int i = 0; i < 365; i++) {
            for (int j = 0; j < contador; j++) {
                if (matriz[i][j]!=numeros_diferentes[j])
                numeros_diferentes[contador]=matriz[i][0];
                contador++;
            }
        }
    }
    
    public static void mostrar(Integer[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        int n, m;

        System.out.println("Tamaño de las filas");
        n = tamañomatriz();
        System.out.println("Tamaño de las columnas");
        m = tamañomatriz();

        Integer[][] matriz = new Integer[n][m]; //Utilizamos el Integer porque para ordenar de mayor a menor, neceistando la clase collections, los datos primitivos como int no vale.Se necesitan obejtos es por ello que ponemos Integer, o Float o Double...en mayúsucla primero

        rellenarmatriz(matriz, n, m);
        ordenar(matriz, n, m);
    }

    
}
