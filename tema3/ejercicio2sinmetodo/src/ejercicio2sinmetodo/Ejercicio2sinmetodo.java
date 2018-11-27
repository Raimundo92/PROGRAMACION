/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2sinmetodo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2sinmetodo {

    /**
     * @param args the command line arguments
     */
    
    public static void valorarray(float array[], int n) {
        Scanner entrada = new Scanner(System.in);
        int i;
        
        for(i=0;i<=n-1;i++){
            System.out.println("escribe valor para el vector");
            array[i]=entrada.nextFloat();
            System.out.println(array[i]);
        }

        for(i=3;i<=7;i++){
            array[i]=0;
              
            
        }
        for(i=0;i<=n-1;i++){
            System.out.println(array[i]);
        }
        }

    

    public static void main(String[] args) {
        int n=20;
        
       
        float array[] = new float[n];
        valorarray(array,n);

    }

}