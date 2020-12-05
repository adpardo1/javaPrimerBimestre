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
public class Calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        double n1, n2, r;
        int op;
        n1=0; n2=0; r=0;op=0;
        
        System.out.println("Calculadora basica");
        System.out.println("Ingrese el primer numero");
        n1=leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        n2=leer.nextDouble();
        //Menu de opciones 
        System.out.println("Escoja un proceso de calculo");
        
        System.out.println("1= Suma");
        System.out.println("2= Resta");
        System.out.println("3= Multiplicacion");
        System.out.println("4= Division");
        op=leer.nextInt();
        //Procesos
        switch (op){
            case 1:{
                r= n1+n2;
                System.out.println("La suma es "+r);
            }
            break;
            case 2:{
                r= n1- n2;
                System.out.println("La resta es "+r);
            }
            break;
            case 3: {
                r = n1*n2;
                System.out.println("La multiplicacion es "+r);
            }
            break;
            case 4:{
                r=n1/n2;
                System.out.println("La division es "+r);
            }
            break;
            
        }
        
    }
    
}
