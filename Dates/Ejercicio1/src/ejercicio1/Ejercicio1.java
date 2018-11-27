/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author imayo
 */
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.util.Calendar;
public class Ejercicio1 {

    public static GregorianCalendar obtenerfecha(){
    Scanner entrada=new Scanner (System.in);
    int año,mes,dia;
        System.out.println("Escriba su año de nacimiento");
        año=entrada.nextInt();
        System.out.println("Escriba el mes de nacimiento");
        mes=entrada.nextInt();
        System.out.println("Escriba el día de nacimiento");
        dia=entrada.nextInt();
        GregorianCalendar fecha = new GregorianCalendar(año,mes-1,dia);
        return fecha;
    }
    public static void años(GregorianCalendar fecha){
    GregorianCalendar fecha_hoy=new GregorianCalendar();
    int edad=0;
    if(fecha.compareTo(fecha_hoy)== -1){
        if((fecha_hoy.get(Calendar.MONTH)>=fecha.get(Calendar.MONTH)&&(fecha_hoy.get(Calendar.MONTH)>=fecha.get(Calendar.DAY_OF_MONTH)))){
        edad=fecha_hoy.get(Calendar.YEAR)- fecha.get(Calendar.YEAR);
        }
        else{
        edad=fecha_hoy.get(Calendar.YEAR)-fecha.get(Calendar.YEAR);
        edad=edad-1;
        }    
    
    
    }
    System.out.println("La edad es: "+edad);
        
    }
    
    public static void main(String[] args) {
       
       GregorianCalendar fecha=obtenerfecha();
       años(fecha);
       
      
       
        
    }
    
}
