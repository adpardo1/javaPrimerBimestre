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
public class ValorPositivo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa para saber si un numero es positivo o negativo");
        //Declaracion e inicializacion de variables
        double v;
        v=0;
        
        System.out.println("Ingrese el numoero a identificar");
        v= leer.nextDouble();
        //Proceso
        if (v<0){
            System.out.println("Su valor "+v+", es negativo");
        }
        else{
            System.out.println("Su valor "+v+", es positivo");
        }
        
    }
    
}
