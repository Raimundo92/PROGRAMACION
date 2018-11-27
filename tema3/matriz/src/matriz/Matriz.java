/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Sheila
 */
import java.util.Scanner;
public class Matriz {
    public static int obtenertamaño(){
    Scanner entrada= new Scanner (System.in);
    int n;
        System.out.println("escribe el tamaño de la matriz");
        n=entrada.nextInt();
        return n;
    }
    public static void valormatriz(float matriz1[][], int n, int m){
    Scanner entrada= new Scanner (System.in);
    int i, j;
    
        for( i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
            System.out.println("escribe valores para la matriz");
            matriz1[i][j]=entrada.nextFloat();
            System.out.println(matriz1[i][j]);
            }
        }
       
    }
       
    public static void main(String[] args) {
        
        int n,m;
        
        n=obtenertamaño();//fila
        m=obtenertamaño();//columnas
        float[][] matriz1=new float[n][m];
        
        
    }
    
}
