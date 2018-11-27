/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Escribe una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    }
    public static void sustituir(String frase){
    String frasedef="";  
    int posicion;
    String cad="ñ";                         //La clase replace no me dejaba poner un texto y luego un caracter. pero si un texto y luego una cadena
    posicion=frase.indexOf("ny");
    if (posicion!=-1)                                       //si da posicion menos 1 querrá decir que no hay "ny" en frase y no tendría que hacer replace   
    frasedef=frase.replace("ny",cad);
    System.out.print(frasedef);
    }
    public static void main(String[] args) {
    String frase;
    frase=obtenerfrase();
    sustituir(frase);
    }
    
}
