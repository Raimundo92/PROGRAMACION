
package ejerciciocadenas4;

import java.util.Scanner;




public class EjercicioCadenas4 {

    
    public static String IngreseCadena(){
    
    Scanner entrada=new Scanner (System.in);
    String cadena;
    System.out.println("Escriba una cadena:");
    cadena= entrada.nextLine();
    return cadena;
    }
    
    public static char caracter(){
    Scanner entrada=new Scanner (System.in);
    char caracter;
    System.out.println("Escriba una letra para ponerlo en mayuscula:");
    caracter=entrada.next().charAt(0);
    return caracter;
    }
    
    public static void main(String[] args) {
        int i;
        String cadena=IngreseCadena();
        char caracter=caracter();
        char[] array=cadena.toCharArray();
        for(i=0;i<array.length;i++){
            if(array[i]==caracter){
                array[i]=cadena.toUpperCase().charAt(i);
            }
        }
        System.out.println(array);
    }
    
}
