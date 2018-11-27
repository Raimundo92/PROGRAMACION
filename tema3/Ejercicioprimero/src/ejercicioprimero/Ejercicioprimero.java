/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprimero;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Ejercicioprimero {
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
    public static void main(String[] args) {
       int n;
       
       n=obtenertamaño();
       float[] array1=new float[n];
       array1=valorarray(array1);
            
    }
}
