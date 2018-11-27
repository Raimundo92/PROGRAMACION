/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
public class Ejercicio14 {
    
    public static float obtenerdia(){
    
    Scanner entrada=new Scanner(System.in);
    float num;
    
        System.out.println("Introduce un día de la semana (1 al 7)");
        
        num=entrada.nextFloat();
        
               
     
                
        return num;    
    
}
    public static void calcularlaboral(float num){
    
   if ((num>=1) && (num<=5))
            System.out.println("es entre semana");
   
   else 
        if ((num==6) || (num==7))
            System.out.println("es fin de semana");
   
        
       
    }
    
    public static void main(String[] args){
        
    float num;
    
    num=obtenerdia();
    calcularlaboral(num);    
            
        }
    
       
    
    
    
    
    
    }