+/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaaa;

import java.util.Scanner;
public class Pruebaaa {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int num1,num2,num3;
        int mayor,menor;
        System.out.println("ESCRIBE UN NÚMERO");
        num1=entrada.nextInt();
        System.out.println("escribe otro numero");
        num2=entrada.nextInt();
        System.out.println("ESCRIBE OTRO NUMERO");
        num3=entrada.nextInt();
        
        mayor=num1;
        menor=num2;
        if (num1>mayor){
        mayor=num1;
        }
        else if(num1<menor){
        menor=num1;}
        
        
        if (num2>mayor){
        mayor=num2;
        }
        else if(num2<menor){
        menor=num3;}
        
        if (num3>mayor){
        mayor=num3;
        }
        else if(num3<menor){
        menor=num2;}
        System.out.println("el menor es"+menor);
        System.out.println("el mayor es "+mayor);
    }
    
}
