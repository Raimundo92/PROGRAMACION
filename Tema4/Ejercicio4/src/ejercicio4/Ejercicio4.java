/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author imayo
 */
public class Ejercicio4 {

    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escriba una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    }
     
    public static char obtenercaracter(){
    Scanner entrada=new Scanner (System.in);
    char x;
        System.out.println("Escriba un carácter");
        x=entrada.next().charAt(0);
        return x;
   }
    public static void minuscula(char x, String s){
       s = s.replace(x,Character.toUpperCase(x));
       System.out.println(s);
    }    
    public static void main(String[] args) {
       String s=obtenerfrase();
       char x=obtenercaracter();
       minuscula(x,s);
    }
    //for(i=0;i<array.length;i++){
           // if(array[i]==caracter){
               // array[i]=s.toUpperCase().charAt(i); //Así también valdría
            }
       
