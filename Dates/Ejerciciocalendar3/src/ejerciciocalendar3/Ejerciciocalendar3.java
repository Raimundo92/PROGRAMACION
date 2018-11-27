/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalendar3;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
public class Ejerciciocalendar3 {



    public static GregorianCalendar obtenercalendario(){
        Scanner entrada=new Scanner(System.in);
        int año,mes,dia;
        boolean correcto=false;
        do{
        System.out.println("Escriba un año");
        año=entrada.nextInt();
        System.out.println("Escriba un mes");
        mes=entrada.nextInt();
        System.out.println("Escriba un día");
        dia=entrada.nextInt();
        correcto=comprobarcorrecto(correcto,año, mes, dia);
        }
        while(correcto==false);
        GregorianCalendar fecha = new GregorianCalendar(año,mes,dia);
        return fecha;
    
        }   
    public static Boolean comprobarcorrecto(boolean correcto, int año, int mes, int dia){ //En el momento que algo no se cumpla será false y por tanto en la función obtenercalendario se repetirá desde el do al while. Si es correcto, 'correcto' se volverá true y saldrá del bucle
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {       //if (fecha.isLeapYear(año)) es otra forma de calcularlo, lo tiene la clase GregorianCalendarpara saber si es bisiesto
            if((mes==2) && (0<dia && dia<=29)){
            correcto=true;
            }
            else if((mes==1 || mes==3|| mes==5|| mes==7|| mes==8|| mes==10|| mes==12) && (0<dia && dia<=31)){
                correcto=true;
                }            
                else if((mes==4 || mes==6|| mes==9|| mes==11)&&(0<dia && dia<=30)){
                correcto=true;
                }
        }
        else if ((mes==1 || mes==3|| mes==5|| mes==7|| mes==8|| mes==10|| mes==12)&&(0<dia && dia<=31)){
            correcto=true;
            }
            else if((mes==4 || mes==6|| mes==9|| mes==11)&&(0<dia && dia<=30)){
                correcto=true;
                }
                else if((mes==2) && (0<dia && dia<=28)){
                correcto=true;    
                }
        return correcto;
    }
    public static void diasiguiente(GregorianCalendar fecha){
       
    fecha.add(Calendar.DAY_OF_MONTH,1);
    fecha.add(Calendar.MONTH,-1); //Hay un desfase y nos ponía el mes siguiente. Le restamos uno para que nos de el mes correcto
        System.out.println("El día siguiente a la fecha es "+fecha.getTime());
    }
    public static void diaanterior(GregorianCalendar fecha){
    fecha.add(Calendar.DAY_OF_MONTH,-2); //Restamos dos porque anteriormente se ha sumado uno en el método diasiguiente.
      //Aquí no restamos un mes ya que anteriormete se ha hecho.
      //Si no queremos tantas cuentas pues podríamos pasarle a un nuevo GregorianCalendar que creemos con los datos de 'fecha': GregorianCalendar fecha2=new GregorianCalendar(año,mes,dia); y se lo pasamos al método dianterior.                             
   
        System.out.println("El día anterior a la fecha es "+fecha.getTime());
    }
    
    public static void main(String[] args) {
      GregorianCalendar fecha;
      fecha=obtenercalendario();
      diasiguiente(fecha);
      diaanterior(fecha);
    }
    
}

    
    
    
    

