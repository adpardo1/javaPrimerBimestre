/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligono2;

import java.util.Scanner;



        

/**
 *
 * @author GHOST
 */
public class AreaPoligono2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         // TODO code application logic here
         //Declaracion e inicializacion de variables
         double lc, at, ar, A, B, D, ats, area;
         lc = 0; at = 0; ar = 0; A = 0; B = 0; D = 0; ats = 0; area = 0;
        
         System.out.println("Programa para el calculo del area del poligono compuest");
        
         System.out.println("");
         // lectura de datos 
         System.out.println("Ingrese el lado del cuadrado");
         lc = leer.nextDouble();
         
         System.out.println("Ingrese ela altura del triangulo");
         at = leer.nextDouble();
         
         System.out.println("Ingrese la altura del rectangulo");
         ar = leer.nextDouble();
         
         //Proceso
         A = Math.pow(lc, 2);
         B = (lc *at)/2;
         ats = B *3;
         D = lc *ar;
         area = A + ats + D;
         //Salida de datos 
         System.out.println(" El area del poligno compuesto es "+area+
                 ", compuesto por un cuadrado de lado\n"+lc+
                 ", mas una altura de triangulo"+at+
                 "y un rectangulo de altura"+ar);
         
         
                 
         
    }
    
}
