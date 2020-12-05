/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;

import java.util.Scanner;

/**
 *
 * @author GHOST
 */
public class CiiclosRepetitivos1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int i, n, suma;
        i = 1; n = 0; suma = 0;
        
        //Pedir que se ingrese el límite de los número
        System.out.println("Ingrese el límite de números a presentar");
        n = leer.nextInt();
        
        //Iniciamos el ciclo repetitivo While
        
        while (i <= n){
            System.out.println(i);
            suma = suma + i;
            i = i + 1;
        }
        System.out.println("La suma de los número es: " +suma);
    }
    
}
