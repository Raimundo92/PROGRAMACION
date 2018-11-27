/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escriba una frase no mayor de 20 caracteres"); //Si se quiere 20 exactamente podríamos "Escribe una frase de 20 caracteres"
        frase=entrada.nextLine();
        return frase;
    }
    public static int veces(){
    Scanner entrada=new Scanner (System.in);
    int veces;
        System.out.println("Escriba cuántas veces quieres desfilar");
        veces=entrada.nextInt();
    return veces;
    }
    public static void desfilar(char[]array, int veces){
    int i;
    int j;
    int contador=0;
    do{
    for (i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
    }
    for ( j = 0; j < array.length; j++) {
            System.out.print(array[j]);
    }
    contador++;     
    }while(contador<veces);
    
    }
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int x;
       String frase;
       char[] array;
       do{
       frase=obtenerfrase();
       array=frase.toCharArray();
       }while(array.length > 20); //Si el programa dice que exactamente quiere una frase de 20 posiciones en esta condición pondríamos (while arra.length!=20)
       x=veces();
       desfilar(array,x);
    }
    
}
