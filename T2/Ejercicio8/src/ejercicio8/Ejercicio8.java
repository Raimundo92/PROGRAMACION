/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author imayo
*/
import java.util.Scanner;

public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double v,r;
       Scanner entrada=new Scanner (System.in);
       
       System.out.println("Escribe una velocidad en k/h");
       v= entrada.nextDouble();
       System.out.println(v);
       r= (v*1000)/3600;
       System.out.println("el resultado es:"+r+"m/s");
    }
    
}
