/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

       
public class Ejercicio8 {
    public static String obtenerfrase(){
        Scanner entrada=new Scanner (System.in);
        String frase;
        System.out.println("Escriba aquí");
        frase=entrada.nextLine();
        return frase;
    }
    
    public static void main(String[] args) {
        String nombre,apellido1,apellido2;
        System.out.println("Escriba su nombre");
        nombre=obtenerfrase();
        System.out.println("Escriba su primer apellido");
        apellido1=obtenerfrase();
        System.out.println("Escriba su segundo apellido");
        apellido2=obtenerfrase();
        String nombre_completo;
        nombre_completo=apellido1+" "+apellido2+" "+nombre;
        char[]array=nombre_completo.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    
}
