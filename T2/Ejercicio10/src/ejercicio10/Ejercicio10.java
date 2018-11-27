/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */ 
    
    public static float obtenernumero(){
    
    Scanner entrada=new Scanner(System.in);
    float num;
        System.out.println("Introduce un nº");
        num=entrada.nextFloat();
        return num;
    }
         
    public static void paroimpar(float num){
     float r=num%2;
        if (r==0)
            System.out.println("El número "+num+ " es par");
        else 
            System.out.println("el número "+num+ " es impar, y su resto es "+r);
        
        
        
        
                
    
    }    
    
   
    public static void main(String[] args) {
        
        float num;
        float paroimpar;
        
        num=obtenernumero();
        paroimpar(num);
        
        
    }
    
    
}

