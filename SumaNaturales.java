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
public class SumaNaturales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, cont, suma;
        n=0; cont=1; suma=0; 
        System.out.println("Ingrese el limite del numero a sumr");
        n=leer.nextInt();
        //Iniciamos el ciclo
        while (cont<=n){
            System.out.println(""+cont);
            suma=suma + cont;
            cont=cont+1;
        }
        System.out.println("El resultado de la suma es: "+suma);
    }
    
}
