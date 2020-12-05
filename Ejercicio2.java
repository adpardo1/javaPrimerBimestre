/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.Scanner;


/**
 *
 * @author GHOST
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Inicializacion y declaracion de variables
        
        double cost, desc, total, ntotal, t;
        String nombre, apellido;
        int cant;
        
        t = 0; cant=0; cost=0; desc=0; total=0; ntotal=0;
        nombre=""; apellido="";
        //Entrada de datos
        System.out.println("Ingrese Su nombre");
        nombre=leer.next();
        System.out.println("Ingrese su apellido");
        apellido=leer.next();
        System.out.println("Ingres el tipo de cliente, ya sea 1,2 o 3");
        t =leer.nextDouble();
        System.out.println("Ingrese la cantidad de libros");
        cant=leer.nextInt();
        System.out.println("Ingrese el costo del libro");
        cost=leer.nextInt();
        //Procesos y calculos
        total= cost*cant;
        if ((t<=1.0)&&(t>=1.0)&&(cant<5)){
            desc=total*0.30; 
            ntotal=total-(total * 0.30);
        }
        if((t<=2.0)&&(t>=2.0)&&(cant<5)){
            desc = total*0.20; 
            ntotal=total-(total * 0.20);
                   
        }
        if ((t<=3.0)&&(t>=3.0)&&(cant<5)){
            desc = total*0.10;  
            ntotal=total-(total * 0.10);
                         
            }                      
        
        if ((t<=1.0)&&(t>=1.0)&&(cant>=5)&&(cant<10)){
           desc= (total*0.30)+(total*0.04);
           ntotal=total-(total*0.30)-(total* 0.04);           
        }
        if ((t<=2.0)&&(t>=2.0)&&(cant>=5)&&(cant<10)){
            desc= (total*0.20)+(total*0.04);
            ntotal=total-(total*0.20)-(total* 0.04);
        }
        if ((t<=3.0)&&(t>=3.0)&&(cant>=5)&&(cant<10)){
            desc = (total*0.10)+(total*0.04);
            ntotal=total-(total*0.10)-(total* 0.04);
        }
        if ((t<=1.0)&&(t>=1.0)&&(cant>=10)){
            desc = (total*0.30)+(total*0.08);
            ntotal=total-(total*0.30)-(total* 0.08);
        }
        if ((t<=2.0)&&(t>=2.0)&&(cant>=10)){
            desc = (total*0.20)+(total*0.08);
            ntotal=total-(total*0.20)-(total* 0.08);
        }
        if ((t<=3.0)&&(t>=3.0)&&(cant>=10)){
            desc = (total*0.10)+(total*0.08);
            ntotal=total-(total*0.10)-(total* 0.08);
        }
        System.out.println("El cliente"+nombre+" "+apellido+", tiene una factura de "+total+"con un descuento de "+desc+", aplicando el descuetno se debe pagar un total de"+ntotal);
        
        
         
            
            
        
        
        
        
        
               
    }
    
}
