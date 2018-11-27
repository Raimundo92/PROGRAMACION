/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author imayo
 */
public class Ejercicio2 {

    public static int obtenernumero() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Escribe un número");
        n = entrada.nextInt();
        return n;
    }
    
    public static int sumarepetida(int n){
        int contador=0;
        int i;
        int[] array=new int[n];
            for (i = 0; i<=n; i++) {
            contador=contador+i;
            }
            System.out.println(contador);
        return contador;
    }
    public static char continuar(char x){
    Scanner entrada=new Scanner (System.in);
    System.out.println("Deseas continuar?(s/n)");
    x=entrada.next().charAt(0);
    return x;
    }
    
    public static void main(String[] args) {
        int n;
        char x='n';
        do {
            n=obtenernumero();
            n=sumarepetida(n);
            x = continuar(x);
        } while(x == 's');
        
    }
    
}
