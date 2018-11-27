/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author imayo
 */
public class Ejercicio4 {
    
    
    public static GregorianCalendar obtenercalendario(){
        Scanner entrada=new Scanner(System.in);
        int año,mes,dia;
                
        System.out.println("Escriba un año");
        año=entrada.nextInt();
        System.out.println("Escriba un mes");
        mes=entrada.nextInt();
        System.out.println("Escriba un día");
        dia=entrada.nextInt();
        GregorianCalendar fecha = new GregorianCalendar(año,mes,dia);
        return fecha;
    }
    public static void calcular(GregorianCalendar fecha){
         GregorianCalendar fecha_hoy = new GregorianCalendar();
        int años=0;
        if(fecha.compareTo(fecha_hoy)== -1){
        if((fecha_hoy.get(Calendar.MONTH)>=fecha.get(Calendar.MONTH)&&(fecha_hoy.get(Calendar.MONTH)>=fecha.get(Calendar.DAY_OF_MONTH)))){
        años=fecha_hoy.get(Calendar.YEAR)- fecha.get(Calendar.YEAR);
        }
        else{
        años=fecha_hoy.get(Calendar.YEAR)-fecha.get(Calendar.YEAR);
        años=años-1;
        }    
    }
      System.out.println("Los años son: "+años*52+" semanas");  
    }
     public static GregorianCalendar nuevafecha(){
        Scanner entrada=new Scanner(System.in);
        int año,mes,dia;
                
        System.out.println("Escriba un año");
        año=entrada.nextInt();
        System.out.println("Escriba un mes");
        mes=entrada.nextInt();
        System.out.println("Escriba un día");
        dia=entrada.nextInt();
        GregorianCalendar fecha = new GregorianCalendar(año,mes,dia);
        return fecha;
    }
    public static void estacion(GregorianCalendar fecha){
        
    if ((fecha.get(Calendar.MONTH)==12 && fecha.get(Calendar.DAY_OF_MONTH)>21) || (fecha.get(Calendar.MONTH)==1 || (fecha.get(Calendar.MONTH)==2 || ((fecha.get(Calendar.MONTH)mes==3 && fecha.get(Calendar.DAY_OF_MONTH)<21))){
        System.out.println("Es invierno");}
        else if((mes==3 && fecha.get(Calendar.DAY_OF_MONTH)>21) || mes==4 || mes==5 || (mes==6 && fecha.get(Calendar.DAY_OF_MONTH)<21)){
            System.out.println("Es primavera");    
        }
        else if((mes==6 && fecha.get(Calendar.DAY_OF_MONTH)>21) || mes==7 || mes==8 || (mes==9 && fecha.get(Calendar.DAY_OF_MONTH)<21)){
            System.out.println("Es verano");
    }
    
    else {
        System.out.println("Es otoño");}

    }
    public static void main(String[] args) {
        
        GregorianCalendar fecha_nacimiento;
        fecha_nacimiento=obtenercalendario();
        calcular(fecha_nacimiento);
        GregorianCalendar estacion;
        estacion=nuevafecha();
        estacion(estacion);
        
    }
}
