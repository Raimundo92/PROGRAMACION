/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio1 {

    public static int tamañovector(){
    Scanner entrada=new Scanner (System.in);
    int n;
        System.out.println("Escriba el tamaño del vector");
        n=entrada.nextInt();
        return n;
    }
    public static void valores(int[] vector){
    Scanner entrada=new Scanner(System.in);
        System.out.println("Dé valores al vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i]=entrada.nextInt();
            }
    }
    public static int valorabuscar(){
    Scanner entrada=new Scanner(System.in);
    int x;
        System.out.println("Escriba el valor a buscar en el vector");
        x=entrada.nextInt();
        return x;
    }
    public static void comprobar(int x, int[]array){
     boolean existe=false;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==x){
                existe=true;
                System.out.println("Existe y además está en la posición "+(i+1));
            }
        }
        if (existe==false){
         System.out.println("No existe");
        }
    }
    public static void main(String[] args) {
        int n,x;
                
        n=tamañovector();
        int[] array=new int[n];
        valores(array);
        x=valorabuscar();
        comprobar(x,array);
    }
    
}
