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
public class AreaTerreno {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declara e inicializar variables
        double va, vb, vc, at, art, arr, area, costo, total;
        va = 0; vb = 0; vc = 0; at = 0; art = 0; arr = 0; area = 0; costo = 0; total = 0;
        System.out.println("Programa para el calculo del area de un terreno ");
        System.out.println("=====================================");
        
        // Lectura de datos 
        System.out.println("Ingrese el valor de A en metros");        
        va = leer.nextDouble();
        
        System.out.println("Ingrese el valor de B en metros");
        vb = leer.nextDouble();
        
        System.out.println("Ingrese el valor de C en metros");
        vc = leer.nextDouble();
        
        System.out.println("Ingrese el precio en dolares por metro");
        costo = leer.nextDouble();
        
        // Procesos para calcular el area del terreno 
        
        at = va - vc;
        art = (vb*at)/2;
        arr = vb * vc;
        area = art + arr;
        total = costo * area;
        
        
        // Salida de datos 
        System.out.println("El area del terreno es " +area+ ", con un valor de " +total+ " dolares");
        System.out.println("Compuesto de un rectangulo de area " +art+ ", y un rectangulo de area " +arr);
        
        
        
    }
    
}
