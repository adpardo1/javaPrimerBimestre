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
public class Potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Inicializacion y declaracion de variables
        int n, p, cont, r;
        n=0; p=0; cont=1; r=1;
        //Ingreso de datos
        System.out.println("Programa para calcular la potencia de un numero");
        System.out.println("Ingrese la base: ");
        n= leer.nextInt();
        System.out.println("Ingrese la potencia: ");
        p=leer.nextInt();
        //Procesos
        while (cont<=p){
            r=r*n;
            cont=cont+1;
        }
        //Presentar el resultado
        System.out.println("La potencia de "+n+" elevado a "+p+" es: "+r);
        
        
    }
    
}
