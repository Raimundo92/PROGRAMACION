/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas2;
import java.util.Scanner;
/**
 *
 * @author msoto
 */
public class Cadenas2 {
    
    public static String ingresecadena() {
         Scanner teclado=new Scanner(System.in);
         String frase;
         System.out.println("Escriba una frase : ") ;
         frase=teclado.nextLine();
         return frase;
    }
    
    public static char ingresecaracter(){
        Scanner teclado=new Scanner (System.in);
        char letra;
        System.out.println("Escriba una letra : ") ;
        letra=teclado.next().charAt(0);
        return letra;
    }
    
    public static void cantidadcaracter(String frase, char letra){
        int i, contadorletra=0;
        String frase2 = frase.toLowerCase();
        char array[]= frase2.toCharArray();
        for (i=0;i<array.length-1;i++)
            if (array[i]== letra){
            contadorletra++;
            } System.out.print("Hay "+contadorletra+" letras "+letra);
}
    
    public static void main(String[] args) {
         String frase= ingresecadena();
         char letra=ingresecaracter();
         cantidadcaracter(frase, letra);
    }
    
}
