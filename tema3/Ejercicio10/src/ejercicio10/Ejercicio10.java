/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Ejercicio10 {
public static int obtenertamaño(){
    Scanner entrada=new Scanner (System.in);
    int n;
        System.out.println("escribe el número de alumnos");
        n=entrada.nextInt();
        return n;
    }
    public static float[] valorarray(float[] array) {
        Scanner entrada = new Scanner(System.in);
        int i;
        
        for (i = 0; i <= array.length - 1; i++) {
            System.out.println("escribe las medidas de los alumnos");
            array[i] = entrada.nextFloat();
            System.out.println(array[i]);
        }
        return array;
    }
    public static float media(float[] array1, int n){
    int i;
    float resultado=0;
    for (i = 0; i <=n - 1; i++) {
            
            resultado= resultado + array1[i];
            
        }
            resultado=resultado/n;
            System.out.println("el resultado de la media de las estaturas es"+resultado);
            
        return resultado;
    
    
    }
    public static void main(String[] args) {
       int n;
       float media;
       n=obtenertamaño();
       float[] array1=new float[n];
       array1=valorarray(array1);
       media=media(array1,n);  
    }
}
