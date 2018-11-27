/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4sinmetodo;

/**
 *
 * @author Sheila
 */
import java.util.Scanner;

public class Ejercicio4sinmetodo {

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

    public static int obtenermenor(float[] array, int ind) {
        int i;
        int menor;
        menor=ind;
        for (i = ind; i <= array.length-1; i++) {
            if (array[i] < array[menor] ) {
               menor=i;
            }
            }
        return menor;
    }
    public static void ordenar(float[] array){
    int i,menor;
    float aux;
    
    for(i=0;i<=array.length-1;i++){
    menor=obtenermenor(array,i);
    if (array[i]>array[menor]){
        aux=array[menor];
        array[menor]=array[i];
        array[i]=aux;
    }
    }
    }
    public static void main(String[] args) {
        int n;
        int i;
        n = obtenertamaño();
        float[] array = new float[n];
        array = valorarray(array);
        
         for (i=0;i<=array.length-1;i++){
            System.out.print(array[i] + " ");
        
        } 
        System.out.println("");
        ordenar(array);
        
        for (i=0;i<=array.length-1;i++){
            System.out.print(array[i] + " ");
        
        }        
        
    }

}
