/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;
import java.util.Scanner;

/**
 *
 * @author GHOST
 */
public class Taller6c3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Inicializacion y declaracion de varialbes 
        int Num, suma = 0, i = 0, media, suma1;
               
        System.out.println("Ingrese números: ");
        while (suma <= 10000) {
            Num = leer.nextInt();
            suma1 = suma;
            suma = suma + Num;
            i++;
            if (suma > 10000) {
                media = suma1 / i;
                System.out.println("Total acumulado: " + suma1);
                System.out.println("Números Introducidos: " + i);
                System.out.println("La media: " + media);
            }
        }
    }
    
}
