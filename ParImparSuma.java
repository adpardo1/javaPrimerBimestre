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
public class ParImparSuma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        int cont,n, num, sumapar, sumaimpar,sumane, sumapos;
        cont=1;n=1;num=0;sumapar=0;sumaimpar=0;sumane=0;sumapos=0;
        System.out.println("Ingrese el liminte del numero a verificar: ");
        n=leer.nextInt();
        //Creacion del ciclo
        while (cont<=n){
            System.out.println("Ingrese el numero a verificar");
            num=leer.nextInt();
            if (num%2==0){
                sumapar= sumapar + num;
            }
            else{
                sumaimpar= sumaimpar+num;
            }
            if (num>0){
                sumapos= sumapos +num;
            }
            else{
                sumane = sumane +num;
            }
            cont=cont+1;
                        
            System.out.println("La suma de los pares es: "+sumapar);
            System.out.println("La suma de los impares es: "+sumaimpar);
            System.out.println("La suma de los positivos es: "+sumapos);
            System.out.println("La suma de los numeros negativos es: "+sumane);
        }
        System.out.println("La sumas totales son: ");
        System.out.println("La suma de los pares es: "+sumapar);
        System.out.println("La suma de los impares es: "+sumaimpar);
        System.out.println("La suma de los positivos es: "+sumapos);
        System.out.println("La suma de los numeros negativos es: "+sumane);
        
        
    }
    
}
