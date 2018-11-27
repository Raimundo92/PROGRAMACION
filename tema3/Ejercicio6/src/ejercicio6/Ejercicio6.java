/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Ejercicio6 {

    public static int obtenertamaño(){
    Scanner entrada= new Scanner (System.in);
    int n;
        System.out.println("escribe el tamaño de la matriz");
        n=entrada.nextInt();
        return n;
    }
    public static void valormatriz(double matriz1[][], int n, int m){
    Scanner entrada= new Scanner (System.in);
    int i, j;
    
        for( i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
            System.out.println("escribe valores para la matriz");
            matriz1[i][j]=entrada.nextDouble();
            System.out.println(matriz1[i][j]);
            }
        }
       
    }
    public static void multiplicacion(double[][] matriz1, double[][] matriz2, int n, int m){
    int i,j;
    double[][] matrizp=new double[n][m];
    for( i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
                matrizp[i][j]= matriz1[i][j]*matriz2[i][j];
                System.out.println("El producto de la matriz es"+matrizp[i][j]);
            }
    
    
    }
    }
    public static void main(String[] args) {
        
        int n,m;
        
        n=obtenertamaño();//fila
        m=obtenertamaño();//columnas
        double[][] matriz1=new double[n][m];
        System.out.println("escribe valores para la primera matriz");
        valormatriz(matriz1,n,m);
        System.out.println("escribe valores para la segunda matriz");
        double [][] matriz2=new double [n][m];
        valormatriz(matriz2,n,m);
        multiplicacion(matriz1,matriz2,n,m);
    }
    
}

