/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Ejercicio4 {
public static GregorianCalendar obtenerfecha() {
        Scanner entrada = new Scanner (System.in);
        int año, mes, dia;
        System.out.println("Año de nacimiento");
        año = entrada.nextInt();
        System.out.println("mes de nacimiento");
        mes = entrada.nextInt();
        System.out.println("día de nacimiento");
        dia = entrada.nextInt();
        GregorianCalendar fecha = new GregorianCalendar(año,mes-1,dia);
        return fecha;
    }
    
    public static void edad(GregorianCalendar fecha) {
        GregorianCalendar fecha_hoy = new GregorianCalendar();
        int edad=0;
        if (fecha.compareTo(fecha_hoy)==-1) { //Si da menos 1 querrá decir que 'fecha_hoy' es más reciente que 'fecha' y entrará en la condición
            if((fecha_hoy.get(Calendar.MONTH)==fecha.get(Calendar.MONTH)) && (fecha_hoy.get(Calendar.DAY_OF_MONTH) >=fecha.get(Calendar.DAY_OF_MONTH))) { 
                edad = fecha_hoy.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
            } else if (fecha_hoy.get(Calendar.MONTH) > fecha.get(Calendar.MONTH)) {
                edad = fecha_hoy.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
            }
            else {
                edad = fecha_hoy.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
                edad--;
            }
        }
        
        if (fecha_hoy.get(Calendar.MONTH)==fecha.get(Calendar.MONTH)&& fecha_hoy.get(Calendar.DAY_OF_MONTH)==fecha.get(Calendar.DAY_OF_MONTH)){
            System.out.println("Muchas felicidades por tu cumpleaños");}
        
        if(edad==0){//para niños menores de un año
        edad = fecha_hoy.get(Calendar.WEEK_OF_YEAR) - fecha.get(Calendar.WEEK_OF_YEAR);
        System.out.println(edad+" semanas");
        }
        else if(edad>0){
        System.out.println("Edad: "+edad*52+" semanas");
        }
    } 
    public static GregorianCalendar fechanueva() {
        Scanner entrada = new Scanner (System.in);
        int año, mes, dia;
        System.out.println("Año ");
        año = entrada.nextInt();
        System.out.println("mes ");
        mes = entrada.nextInt();
        System.out.println("día ");
        dia = entrada.nextInt();
        GregorianCalendar fecha = new GregorianCalendar(año,mes-1,dia);
        return fecha;
    }
    public static void calcularestacion(GregorianCalendar estación){
           
        
        if (estación.get(Calendar.MONTH)==1 ||estación.get(Calendar.MONTH)==2 || (estación.get(Calendar.MONTH)==3 && estación.get (Calendar.DAY_OF_MONTH)<21)|| (estación.get(Calendar.MONTH)==12 && estación.get (Calendar.DAY_OF_MONTH)>21)  ){
            System.out.println("Es invierno");}
            else if(estación.get(Calendar.MONTH)==4 ||estación.get(Calendar.MONTH)==5 || (estación.get(Calendar.MONTH)==3 && estación.get (Calendar.DAY_OF_MONTH)>21) || (estación.get(Calendar.MONTH)==6 && estación.get (Calendar.DAY_OF_MONTH)<21)){
            System.out.println("Es primavera");}
                else if(estación.get(Calendar.MONTH)==7 ||estación.get(Calendar.MONTH)==8 || (estación.get(Calendar.MONTH)==6 && estación.get (Calendar.DAY_OF_MONTH)>21) || (estación.get(Calendar.MONTH)==9 && estación.get (Calendar.DAY_OF_MONTH)<21)){
            System.out.println("Es verano");}
            
        else{
            System.out.println("Es otoño");}    
        }
        
        
    
    public static void main(String[] args) {
        GregorianCalendar fecha;
        fecha=obtenerfecha();
        edad(fecha);
        GregorianCalendar estacion;
        estacion=fechanueva();
        calcularestacion(estacion);
       
    }
    
}
