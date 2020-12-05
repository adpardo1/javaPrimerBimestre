/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actextraclase1;
import java.util.Scanner;


/**
 *
 * @author GHOST
 */
public class ActExtraclase1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        // Declaracion e inicializacion de variables
        double vm, vc, vk, vpi, vpul;
        vm = 0; vc = 0; vk = 0; vpi = 0; vpul = 0;
        //Lectura de datos 
        System.out.println("Ingrese el valor en metros");
        vm = leer.nextDouble();
        //Procesos de calculo
        vc = vm*100;
        vk = vm/1000;
        vpi = vm/3.281;
        vpul = vm*39.37;
        //Salida de datos 
        System.out.println("Su valor en centimetros es "+vc);
        System.out.println("Su valor en kilometros es "+vk);
        System.out.println("Su valor en pies es "+vpi);
        System.out.println("Su valor en pulgadas es "+vpul);
        
        
    }
    
}
