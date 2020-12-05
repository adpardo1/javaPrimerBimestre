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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Inicializacion y declaracion de variables
        double n,r;
        String t;
        n=0;r=0;
        t="";
        System.out.println("Programa para verificar si un numero es multiplo de 4, 5 o 6");
        System.out.println("Ingrese el valor a confirmar, recuerde que debe ser menor a 100");
        n= leer.nextDouble();
        
        //Procesos y salidas
        if (n%4==0){
            r=n/2;
            t=" Multiplo de 4";
            System.out.println("Su resultado es "+r+", por ser "+t);
        }
        else{
            System.out.println("Su valor no es multiplo de 4");
        }
        if (n%5==0){
            r=n*n;
            t=" Multiplo de 5";
            System.out.println("Su resultado es "+r+", por ser "+t);                    
        }
        else{
            System.out.println("Su valor no es multiplo de 5");
        }
        if (n%6==0){
            r=n;
            t=" Multiplo de 6";
            System.out.println("Su resultado es "+r+", por ser "+t);
        }
        else{
            System.out.println("Su valor no nes multiplo de 6");
        }
    }
    
}
