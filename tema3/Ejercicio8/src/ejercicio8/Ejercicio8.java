/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void alumnos(int[][] matriz, int n, int m){
    Scanner entrada=new Scanner(System.in);
        int i,j;
    for (i=0;i<=n-1;i++){
         for (j=0;j<=m-1;j++){
            System.out.println("número de alumnos");
            matriz[i][j]=entrada.nextInt();
            
          }  
    }
    
        System.out.println("El número de alumnos para nivel básico de inglés"+matriz[0][0]);
        System.out.println("El número de alumnos para nivel básico francés" +matriz[0][1]);
        System.out.println("El número de alumnos para nivel básico alemán"+matriz[0][2]);
        System.out.println("El número de alumnos para nivel básico ruso"+matriz[0][3]);
        System.out.println("El número de alumnos para nivel medio inglés"+matriz[1][0]);
        System.out.println("El número de alumnos para nivel medio francés"+matriz[1][1]);
        System.out.println("El número de alumnos para nivel medio alemán"+matriz[1][2]);
        System.out.println("El número de alumnos para nivel medio ruso"+matriz[1][3]);
        System.out.println("El número de alumnos para nivel perfeccionamiento inglés"+matriz[2][0]);
        System.out.println("El número de alumnos para nivel perfeccionamiento francés"+matriz[2][1]);
        System.out.println("El número de alumnos para nivel perfeccionamiento alemán"+matriz[2][2]);
        System.out.println("El número de alumnos para nivelperfeccionamiento ruso"+matriz[2][3]);
    }
    
    public static void main(String[] args) {
       int n=3;
       int m=4;
       int matriz[][]=new int [n][m];
       alumnos(matriz,n,m);
    }
    
}
