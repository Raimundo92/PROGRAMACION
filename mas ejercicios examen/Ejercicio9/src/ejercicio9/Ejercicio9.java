/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class Ejercicio9 {

    public static GregorianCalendar obtenerfecha(){
     Scanner entrada = new Scanner (System.in);
        int año, mes, dia;
        System.out.println("Ingrese su fecha de nacimiento año/mes/dia");
        año = entrada.nextInt();
        mes = entrada.nextInt();
        dia = entrada.nextInt();
        GregorianCalendar fecha_nacimiento = new GregorianCalendar(año,mes-1,dia); //Se le resta uno al mes porque empieza desde 0
        return fecha_nacimiento;
    }
    public static void ciendias(GregorianCalendar fecha){
    fecha.add(Calendar.DAY_OF_MONTH,100);
        System.out.println("100 días después serían "+fecha.getTime());
        Calendar cal= Calendar.getInstance(); //Creamos un calendar y sólo se puede crear así
        cal.set(fecha.get(Calendar.YEAR),fecha.get(Calendar.MONTH),fecha.get(Calendar.DAY_OF_MONTH)); //el set es cambiar y get obtener... Así que cambiamos la instancia de calendar que es la actual por los datos que tenemos en la GregorianCalendar
        Date fecha2=cal.getTime();
        DateFormat formato=DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(formato.format(fecha2));
    }  
    public static void main(String[] args) {
     GregorianCalendar fecha=new GregorianCalendar();
     fecha=obtenerfecha();
     ciendias(fecha);
    }
    
}
