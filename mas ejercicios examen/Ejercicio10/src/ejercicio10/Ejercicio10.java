/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;


import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio10 {

    public static int tamañomatriz() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Escriba el tamaño de la matriz");
        n = entrada.nextInt();
        return n;
    }
    public static void rellenarmatriz(Double[][] matriz) {
        int i, j;
       
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random()*100;
            }
        }
    }
    public static void columnadelmayor(Double[][] matriz){
        double mayor; //si quisiera tambien el menor pondría double menor, y pondría menor=matriz[0][1]; por ejemplo
        int i,j=0;
        int fila,columna;
        fila=0;
        columna=0;
        mayor=matriz[fila][columna];
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]>mayor){
                mayor=matriz[i][j];
                fila=i;
                columna=j;
                }
            }
        }
        System.out.println("El mayor es "+mayor+" y está en la fila "+(fila+1)+" y en la columna "+(columna+1)); 
    ordenar(matriz,columna);
    }
    public static void ordenar(Double[][] matriz, int columna) {
        int i;
        Double[] array = new Double[matriz.length]; //aqui estaríamos sacando las filas que tiene la matriz (o sea el tamaño de la columna)
        
        for (i = 0; i < matriz.length; i++) {
            
            array[i] = matriz[i][columna];
        }
        Arrays.sort(array, Collections.reverseOrder());
        
        for (int j = 0; j < matriz.length; j++) { //para meter los valores del array de nuevo en la matriz en la columna
            matriz[j][columna]=array[j];
            System.out.println(matriz[j][columna]);
        }
    }
    public static void main(String[] args) {
        int n, m;

        System.out.println("Tamaño de las filas");
        n = tamañomatriz();
        System.out.println("Tamaño de las columnas");
        m = tamañomatriz();
        
        Double[][] matriz = new Double[n][m];
        rellenarmatriz(matriz);
        columnadelmayor(matriz);
    }
    
}
