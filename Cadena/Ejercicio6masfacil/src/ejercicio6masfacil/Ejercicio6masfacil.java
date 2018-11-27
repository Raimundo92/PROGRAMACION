/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6masfacil;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio6masfacil {

    public static String obtenerfrase(){
    String palabra;
    Scanner entrada=new Scanner (System.in);
    System.out.println("Introduce una palabra");
    palabra=entrada.nextLine();
    return palabra;
    }
    public static void union(String palabra1, String palabra2){
       palabra1=palabra1+ " "+palabra2;
        System.out.println(palabra1);
        }
    public static void main(String[] args) {
        String palabra1;
        String palabra2;
        
       palabra1=obtenerfrase();
       palabra2=obtenerfrase();
       union(palabra1,palabra2);
       
       
    }
    
}