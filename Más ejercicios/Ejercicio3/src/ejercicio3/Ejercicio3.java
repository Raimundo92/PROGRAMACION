/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void obtenerabecedario(char[] abecedario) {
        Scanner entrada = new Scanner(System.in);

        int i;
        System.out.println("Escriba el abecedario");
        for (i = 0; i < 27; i++) {
            abecedario[i] = entrada.next().charAt(0);
        }
        System.out.println(abecedario);
    }

    public static void abecedariosinvocales(char[] abecedario) {
        int i;
        for (i = 0; i < 27; i++) {
            if ((abecedario[i] == 'a') || (abecedario[i] == 'e') || (abecedario[i] == 'i') || (abecedario[i] == 'o') || (abecedario[i] == 'u')) {
                abecedario[i] = '*';
            }
            System.out.println(abecedario);

        }
    
    }
    public static void main(String[] args) {

        char[] abecedario = new char[27];
        obtenerabecedario(abecedario);
        abecedariosinvocales(abecedario);
    }

}
