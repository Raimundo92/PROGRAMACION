/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio11 {

    public static void rellenarmatriz(int[][] matriz) {
        int i, j;
        Random n = new Random();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = n.nextInt(100);
            }
        }
    }

    public static void ordenacion(int[][] matriz) {

        int i,j;
        int array[] = new int[matriz[0].length]; //matriz[o].lengt nos indica el tamaño de la fila 0 de la matriz (que será igual de grande al número de columnas tenga)
        int menor;

        for (i = 0; i < matriz.length; i++) {
            
            menor=i;
            for (j = menor; j <matriz.length ;j++) {//se busca el menor de la columna 0 y se guarda la fila donde se encuentre en menor
                if (matriz[j][0] < matriz[menor][0]) {
                    menor=j;
                }
            }
            if (matriz[i][0] > matriz[menor][0]) { // si el número de la fila que estamos comprobando es mayor que el menor entonces intercambiamos el menor en la posición de la fila y la fila donde se encontraba el menor
                array = matriz[i];
                matriz[i] = matriz[menor];
                matriz[menor]= array;
            }
        }
    
    }
    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
    
    public static void main(String[] args) {
        int n = 365;
        int m = 10;
        int[][] matriz = new int[n][m];
        rellenarmatriz(matriz);
        mostrar(matriz);
        System.out.println("----------------------------------------------------------------------------------------------------------");
        ordenacion(matriz);
        mostrar(matriz);

    }
}
