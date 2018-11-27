/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
public class Ejercicio4 {

    public static int obtener3d(){
    Scanner entrada=new Scanner(System.in);
    int n;
        System.out.println("Escribe la dimensión");
        n=entrada.nextInt();
    return n;
    }
    public static void valores(double[][][] matriz3d, int x, int y, int z){
    Scanner entrada=new Scanner (System.in);
    int i,j,k;
        System.out.println("Escribe valores para la matriz");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                for (k = 0; k< z; k++) {
                    matriz3d[i][j][k]=entrada.nextDouble();
                    System.out.println(matriz3d[i][j][k]);
                }
            } 
        }
    }
    
    public static void main(String[] args) {
        int x,y,z;
        x=obtener3d();
        y=obtener3d();
        z=obtener3d();
        double matriz3d [][][]=new double[x][y][z];
        valores(matriz3d,x,y,z);
    }
    
}
