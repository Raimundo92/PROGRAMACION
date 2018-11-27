/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static String ObtenerFrase() {
        String frase;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        frase = entrada.nextLine();
        return frase;
    }
    
    public static char ObtenerN() {
        char n;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un carácter para buscar");
        n = entrada.next().charAt(0); //Aquí cogería el primer carácter?
        return n;
    }
    
    public static void EncontrarN(char frasedescompuesta[], char n) {
        int contadorN = 0;
        for (int i = 0; i < frasedescompuesta.length; i++) {
            if (frasedescompuesta[i] == n)
                contadorN++;
        }
        System.out.println("Hay "+contadorN+" caracteres " +n);
    }
    
    public static void main(String[] args) {
        
        char n;
        String frase = ObtenerFrase();
        char frasedescompuesta[] = frase.toCharArray();
        n = ObtenerN();
        EncontrarN(frasedescompuesta,n);
    }
    
}
