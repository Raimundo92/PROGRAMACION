/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio12 {

    public static String obtenerfrase() {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("introduce una palabra/frase");
        frase = entrada.nextLine();
        return frase;
    }

    public static int numeroparamostrari() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Indica con un número para mostrar los primeros caracteres de la frase");
        n = entrada.nextInt();
        return n;
    }

    public static void mostrari(char[] array1, int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(array1[i]);
        }
    }

    public static int numeroparamostrarf() {
        Scanner entrada = new Scanner(System.in);
        int m;
        System.out.println("Indica con un número para mostrar los últimos caracteres ");
        m = entrada.nextInt();
        return m;
    }

    public static void mostrarf(char[] array1, int m) {
        int i;
        int h;
        h = (array1.length) - m;
        for (i = h; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
    }

    public static int numeroparaeliminar() {
        Scanner entrada = new Scanner(System.in);
        int y;
        System.out.println("A partir de donde eliminar");
        y = entrada.nextInt();

        return y;
    }

    public static void eliminar(char[] array1, int y) {
        int i, j;
        for (j = 0; j < y-1; j++) {
            System.out.print(array1[j]);
        }
            for (i = y; i < array1.length; i++) {
                array1[i] = ' ';
                System.out.print(array1[i]);
            }

        }
    
    public static void insertarcadena(char[] array1, char[]array2){
    int i,j;
    int x;
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("Escribe desde qué posición quieres insertar la nueva palabra/frase");
    x=entrada.nextInt();
        
        for (i = 0; i < x; i++) {
        }
        System.out.print(array1);
        for (j = x ; j < ((array1.length)+(array2.length)); j++) {
            
        }
        System.out.println(array2);
        
    }
    public static void main(String[] args) {
        String frase;
        String frase2;
        int n, m, y;
        frase = obtenerfrase();
        char[] array1 = frase.toCharArray();
        n = numeroparamostrari();
        mostrari(array1, n);
        System.out.println(" ");
        m = numeroparamostrarf();
        System.out.println(" ");
        mostrarf(array1, m);
        System.out.println(" ");
        y = numeroparaeliminar();
        eliminar(array1, y);
        System.out.println(" ");
        frase2=obtenerfrase();
        char[] array2=frase2.toCharArray();
        insertarcadena(array1, array2);
        
    }

}
