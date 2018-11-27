/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
public class Ejercicio13 {
    

public static double obtenernumero(){
    
    Scanner entrada=new Scanner(System.in);
    double num;
        System.out.println("Introduce un nº");
        num=entrada.nextDouble();
        return num;

}
public static void CalcularPrimo(double num) {
    boolean  primo = true;
    for (int i = 2; i < num; i++) {
        if (num % i == 0)
            primo = false;
    }
    if (primo == true)
        System.out.println("Númro primo");
    else
        System.out.println("Número no primo");
}

public static void main(String[] args){ 

double num;

num=obtenernumero();
}

}