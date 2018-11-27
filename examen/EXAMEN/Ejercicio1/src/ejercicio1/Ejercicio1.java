/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author examendam
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static String obtenerfrase(){
    Scanner entrada=new Scanner (System.in);
    String frase;
        System.out.println("Introduce una palabra/frase");
        frase=entrada.nextLine();
        return frase;
    }
    public static void concatenar(String frase, String frase2){
    String frasedef=frase.concat(frase2);
        System.out.println(frasedef); // Esto es sin espacios. Con espacios sería de esta forma: frasedef=frase+" "+frase2;
    }
    public static void main(String[] args) {
        String frase;
        String frase2;
        frase=obtenerfrase();
        System.out.println("-Repitamos-");
        frase2=obtenerfrase();
        concatenar(frase,frase2);
        
    }
    
}
