/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas1;
import java.util.Scanner;
/**
 *
 * @author msoto
 */
public class Cadenas1 {

    
    public static String ingresecadena() {
         Scanner teclado=new Scanner(System.in);
         String frase;
         System.out.println("Escriba una frase : ") ;
         frase=teclado.nextLine();
         return frase;
    }
    
    
    public static void mayusminus(String frase){
     
     char frase1[] =frase.toCharArray();
     int i, contadorM=0, contadorm=0;
     for(i=0;i<= frase1.length -1;i++){
     
         if (Character.isLowerCase(frase1[i])){
         
             contadorm++;
             
         } else if (Character.isUpperCase(frase1[i])){
             contadorM++;
            }
     }
           System.out.println("Hay "+contadorm+" minúsculas.");
           System.out.println("Hay "+contadorM+" mayúsculas.");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        String frase= ingresecadena();
        mayusminus(frase);
// TODO code application logic here
    }
    
}
