/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;


/**
 *
 * @author GHOST
 */
public class ConvHoras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        int h24, m24, h12, m12;
        String periodo;
        h24 = 0; m24 = 0; h12 = 0; m12 = 0;
        periodo ="a.m.";
        System.out.println("Programa para convertir el formato de 24 horas a 12 horas");
        //Ingresar los datos de entrada
        System.out.println("Ingrese la hora en formato de 24 horas a transformar");
        h24 = leer.nextInt();
        
        System.out.println("Ingrese los minutos a transformar");
        m24 = leer.nextInt();
        
        if((h24<25)&&(h24 >= 0)){
            if ((h24 >= 0)&&(h24<=24)&&(m24 >=0)&&(m24<=60)){
                if ((m24 == 60)&&(h24<24)){
                    h24 = h24 + 1;
                    m24 = 0;
                }
                else {
                    m12 = m24;                   
                    
                }              
                                
                if (h24 >= 12){
                    
                    h12 = h24 -12;
                    periodo = "p.m.";
                    
                }
                else {
                    h12 = h24;
                    periodo ="a.m.";                   
                    
                }
                if (h24 == 0){
                    h12= 12;
                    periodo ="a.m.";
                }
                if((h24 == 24)&&(m24 == 60)){
                    h12=12;
                    m12=0;
                    periodo = "a.m.";
                }
                                      
                
                System.out.println("El tiempo de "+h24+" horas y "+m24+" minutos");
                System.out.println("Equivalente a "+h12+" horas y "+m12+" minutos "+periodo);
            }
            
        }
        else {            
                System.out.println("Error: el valor ingresado no debe superar las 24 horas");
            }
            
                
            
                
            
            
    }      
                                        
}
    
    

