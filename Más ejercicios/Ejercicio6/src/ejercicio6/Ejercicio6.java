/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void valores(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        int i, j;
        
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Escribe valores a la matriz: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    public static void MostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
     public static void main(String[] args) {
        int[][] matriz1 = {{1, 1, 1, 1}, {2, 3, 4, 6}, {4, 6, 4, 3}, {1, 2, 4, 1}, {2, 3, 4, 6}, {1, 6, 4, 3}, {1, 6, 4, 3}};
        int[][] matriz2 = new int[7][4];
        valores(matriz2);
        System.out.println("Matriz 1");
        MostrarMatriz(matriz1);
        System.out.println("Matriz 2");
        MostrarMatriz(matriz2);
    }
}
