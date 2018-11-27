/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    public static void valores(int[] vector){
    Scanner entrada=new Scanner(System.in);
        System.out.println("Dé valores al vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i]=entrada.nextInt();
            }
    }
    public static int numero(){
    Scanner entrada=new Scanner(System.in);
    int n;
        System.out.println("Escriba un valor entero");
        n=entrada.nextInt();
        return n;
    }
    public static void comprobar(int[]array,int x){
    int i;
    int j;
        if (x==2){
            for (i = 0; i < array.length; i++) {
                if(array[i]%2==0){
                System.out.println("Éstos son los elementos pares");
                System.out.println(array[i]);}
        }
        }
        else{
            for (j = 0; j < array.length; j++) {
                if(array[j]%2!=0){
                    System.out.println("Éstos son los elementos impares");
                    System.out.println(array[j]);}
            }
        }
    }
    
    
    public static void main(String[] args) {
        int n=20;
        int x;
        int[]array=new int[n];
        valores(array);
        x=numero();
        comprobar(array,x);
        
    }
    
}
