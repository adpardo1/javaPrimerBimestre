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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double n;
        n=0;
                
        //Condicionales que cualifican la nota del alumno
        System.out.println("Programa para cualificar la nota del alumno");
        System.out.println("Ingrese la nota a cualificar");
        n= leer.nextDouble();
        if (n>=3.0){
            if ((n>=4.6)&&(n<=5.0)){
                System.out.println("Estudiante exlente");                
            }
            else{
                if((n>=4.1)&&(n<=4.5)){
                    System.out.println("El alumno es Muy Bueno");  
                }
                else{
                    if ((n>=3.6)&&(n<=4.0)){
                        System.out.println("El estudiante es Bueno");
                    }
                    else{
                        if ((n>=3.3)&&(n<=5.5)){
                            System.out.println("El alumno registro un desempeño Aveptable");
                        }
                        else{
                            if ((n>=3.0)&&(n<=3.2)){
                                System.out.println("El alumno Aprobado");
                            }
                        }
                    }
                    
                            
                                                      
                            
                            
                    
                }             
                       
               
                
            
            
            
            
        
    }
        
    }
    
}
}
