
package ejerciciocadenas3;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioCadenas3 {

    public static String IngreseCadena(){
    
    Scanner entrada=new Scanner (System.in);
    String palabra;
    System.out.println("Se comprobara si la palabra es un Palindromo");
    System.out.println("Escriba una palabra:");
    palabra= entrada.nextLine();
    return palabra;
    }
    
    public static boolean Palindromo(String palabra){
    int i;
    boolean resultado= true;
    char[] array=palabra.toLowerCase().toCharArray();
    for(i=0;i<array.length-1;i++){
        if (array[i]==array[array.length-i -1]){//Comprueba que el array se lee igual empezando por el principio y el final.
            resultado=true;
        }else{
             resultado=false;
             break;
        }
    }
    
       return resultado; 
    }
    
    public static void main(String[] args) {
        String palabra=IngreseCadena();
        boolean resultado=Palindromo(palabra);
        System.out.println(resultado);
        
    }
    
}
