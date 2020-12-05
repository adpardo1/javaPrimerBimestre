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
public class LeerDatos {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declarar e inicializar variables
        int miEntero = 0;
        double miDecimal = 0;
        String miCadena = "";
        
        //Lectura de datos 
        System.out.println("Ingrese un numero entero");
        miEntero = leer.nextInt();
        
        System.out.println("Ingrese un numero decimal");
        miDecimal = leer.nextDouble();
        
        System.out.println("Ingrese un valor");
        miCadena = leer.next();
        
        System.out.println("Mi valor entero es" +miEntero);
        System.out.println("Mi valor decimal es" +miDecimal);
        System.out.println("Mi valor es" +miCadena);
        
    }
    
}
