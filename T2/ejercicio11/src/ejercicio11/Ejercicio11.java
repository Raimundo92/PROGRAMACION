/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author imayo
 */
import java.util.Scanner;

public class Ejercicio11 {
    
    
public static float obtenernumero(){
    
    Scanner entrada=new Scanner(System.in);
    float num;
        System.out.println("Introduce un nº");
        num=entrada.nextFloat();
        return num;
    }    
    
public static double iva(double num){

 double resultado, resultadof;
 double a=0.21;
 
 resultado= a*num;
 
 resultadof=num-resultado;
 
 
 return resultadof;



}

 public static void main(String[] args){
     
     double num;
     double iva;
     
         
     
     num=obtenernumero();
     iva=iva(num);
     
     System.out.println("El precio final es: "+iva);
     
     
     
 }    
    
}