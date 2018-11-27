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

    public static int obtenernumero() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Escribe un número");
        n = entrada.nextInt();
        return n;
    }

    public static void cuadrado(int n) {
        double raiz;
        raiz = Math.sqrt(n);
        int raiz2 = (int) raiz;
            if (raiz2 * raiz2 == n) {
            System.out.println("El número tiene cuadrado y su raíz es: " + raiz2+" x "+raiz2);
            } else {
            System.out.println("El número no tiene cuadrado");
            }
    }

    public static void main(String[] args) {
        int n;
        n = obtenernumero();
        cuadrado(n);
    }

}
