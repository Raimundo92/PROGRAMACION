/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static int obtenertamaño(){
    Scanner entrada=new Scanner (System.in);
    int T;
        System.out.println("Escriba el tamaño");
        T=entrada.nextInt();
        return T;
    }
    public static int obtenertamaño2(){
    Scanner entrada=new Scanner (System.in);
    int M;
    M=entrada.nextInt();
    return M;
    }
    public static void introducirvalores(int[]array, int n){
    Scanner entrada=new Scanner (System.in);
        System.out.println("introduce valores al vector");
        
        for (int i = 0; i < array.length; i++) {
            array[i]=entrada.nextInt();
            }
        }
    public static void introducirvalores2(int[][]matriz, int n, int m){
    Scanner entrada=new Scanner (System.in);
    int i=0;
    int j=0;
    System.out.println("introduce valores a la matriz");
       for (i = 0; i <n ; i++) {
           for ( j = 0; j < m; j++) {
              matriz[i][j]=entrada.nextInt();
            }
        }
    }
   
    
    public static void main(String[] args) {
        int T,N,M;
        int i,j,k=0;
        
        System.out.println("Introduce el tamaño del vector");
        T=obtenertamaño();
        int[] array=new int[T];
        introducirvalores(array,T);
        System.out.println("Introduce el tamaño de la matriz");
        N=obtenertamaño();
        M=obtenertamaño();
        int[][] matriz=new int[N][M];
        introducirvalores2(matriz,N,M);
        
        for (i = 0; i < T; i++) {
           for (j = 0; j < N; j++) {
               for (k = 0; k < M; k++) {
                   if(array[i]==matriz[j][k]){
                       System.out.println("los que coinciden son "+array[i]);}
               }
               
           }
           
       }
          
    }
}
