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
public class GonvTemo {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        // Inicializar y declarar klas variables
        
        double gc, gf, gk;
        gc = 0; gf =0; gk =0;
        System.out.println("Programa para convertir de grados centigrados a grados Farenheit y a grados Kelvin, ");
        System.out.println("Ingrese el valor en grados centigrados");
        gc = leer.nextDouble();
        //Condicion para convertir a grados de temperatura
        if (gc>0){
                gf=(gc * 9/5)+ 32;
                gk=(gc + 273.15);
                System.out.println("La equivalencia en grados farenheit es: "+gf);
                System.out.println("La equivalencia en grados kelvin es: "+gk);
            
        }
        
        
        
    }
    
}
