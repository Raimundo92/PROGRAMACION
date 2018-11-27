/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1bien;

import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.Calendar;


public class Ejercicio1bien {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int año,mes,dia;
        System.out.println("Escriba su año de nacimiento");
        año=entrada.nextInt();
        System.out.println("Escriba el mes de nacimiento");
        mes=entrada.nextInt();
        System.out.println("Escriba el día de nacimiento");
        dia=entrada.nextInt();
        GregorianCalendar fecha = new GregorianCalendar(año,mes,dia);
        
        Date fecha_hoy=new Date();
        fecha.setTime(fecha_hoy);
        fecha.add(Calendar.YEAR,-año);
        fecha.add(Calendar.MONTH,-(mes+1));
        fecha.add(Calendar.DAY_OF_MONTH,-dia);
        if(mes<0|| mes==0 && dia<0){
        año--;
        }
        System.out.println("Su edad es: "+fecha.getWeekYear()+" años");
    }
    
}
