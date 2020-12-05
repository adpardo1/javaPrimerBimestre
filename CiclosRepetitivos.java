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
public class CiclosRepetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Ciclos repetitivos
        int n, r;
        n=0; r=10;
        System.out.println("Programa para mostrar los 10 primeros numeros de una secuencia");
        System.out.println("Ingrese un numero");
        n=leer.nextInt();
        while(n<10){
            r=n+1;
            System.out.println(""+r);
            n=n+1;
        }
        
        
    }
    
}
