/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;



import java.util.GregorianCalendar;

import java.util.Calendar;

public class Ejercicio2 {
       
    public static void main(String[] args) {
        GregorianCalendar verano= new GregorianCalendar(2019,6-1,22);
        GregorianCalendar fecha_hoy=new GregorianCalendar();
       
        
        int finalaño=365-fecha_hoy.get(Calendar.DAY_OF_YEAR);
        int diasvacaciones=finalaño+verano.get(Calendar.DAY_OF_YEAR);
        System.out.println("QUEDAN PARA EL 22 DE JUNIO "+diasvacaciones);
        
        
    
    }


}
    

