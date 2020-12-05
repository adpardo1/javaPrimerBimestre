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
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Inicializacion y declaracion de variables
        double v1, v2, v3;
        v1 =0; v2 =0; v3 =0;
        System.out.println("Programa para ver cual numero es mayo");
        // Ingresar los valores de entrada
        System.out.println("Ingrese el primer numero");
        v1= leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        v2 = leer.nextDouble();
        System.out.println("Ingrese el tercer numero");
        v3 = leer.nextDouble();
        // Procesos con condicional simple
        
        
        if((v1>v2)&&(v1>v3)){
            System.out.println("Su valor "+v1+", es el numero mayor");
        }
        if ((v2>v1)&&(v2>v3)){
            System.out.println("Su valor "+v2+", es el numero mayor");
        }
        if ((v3>v1)&&(v3>v2)){
            System.out.println("Su valor "+v3+", es el numero mayor");
        }
        //Proceso con condicional compuesto 
        
        
        if((v1>v2)&&(v1>v3)){
            System.out.println("Su valor "+v1+", es el numero mayor");
        }
        else{
            System.out.println(+v1+" No es el mayor");
        }
        if ((v2>v1)&&(v2>v3)){
            System.out.println("Su valor "+v2+", es el numero mayor");
        }
        else{
            System.out.println(+v2+" No es el mayor");
        }
        if ((v3>v1)&&(v3>v2)){
            System.out.println("Su valor "+v3+", es el numero mayor");
        }
        else{
            System.out.println(+v3+" No es el mayor");
        }
        //Proceso con condicional anidada
        
        if ((v1>v2)&&(v1>v3)){
            System.out.println("Su valor "+v1+", es el numero mayor");
            if ((v2>v1)&&(v2>v3)){
                System.out.println("Su valor "+v2+", es el numero mayor");
            }
            
            if ((v3>v2)&&(v3>v1)){
               System.out.println("Su valor "+v3+", es el numero mayor"); 
            }
            
        }
    }
    
}
