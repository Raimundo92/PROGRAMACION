/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {

    public static String nombre(){
    Scanner entrada=new Scanner (System.in);
    String nombre;
    System.out.println("Escriba su nombre");
    nombre=entrada.nextLine();
    return nombre;
    }
    
    public static char caracter(){
    Scanner entrada=new Scanner (System.in);
    char x;
    System.out.println("Escriba un carácter a buscar");
    x=entrada.next().charAt(0);
    return x;
    }
    public static void comprobar(String frase, char c){
    int n=frase.indexOf(c);
       
    if (n>=0){
        System.out.println("Está el carácter");
    }
    else {
        System.out.println("no está el carácter");
    }
    
    }
    public static void main(String[] args) {
        String nombre;
        nombre=nombre();
        char x;
        x=caracter();
        comprobar(nombre,x);
    }
    
}
