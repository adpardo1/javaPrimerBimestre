package ciclosrepetitivos;
import java.util.Scanner;

/**
 *
 * @author GHOST
 */
public class VerificarNum {
    public static void main(String[] args) {
                
        Scanner leer = new Scanner (System.in);
        
        //Declara e inicializar las variables
        
        int cont, n, num, sumPar, sumImpar, sumNeg, sumPos;
        cont = 1; n  = 1; num = 0; sumPar = 0; sumImpar = 0; sumNeg = 0; sumPos = 0;
        
        //Ingresar los datos de entrada: límite
        
        System.out.println("Ingrese el limite de numeros a verificar");
        n = leer.nextInt();
        
        //Procesos
        
        while (cont <= n){
            
            System.out.println("Ingrese el numero a verificar");
            num = leer.nextInt();
            
            if (num % 2 == 0){ 
                sumPar = sumPar + num; 
            }
            else {                         
                sumImpar = sumImpar + num;
            }            
            if (num > 0){ 
                sumPos = sumPos + num; 
            }
            else {
                sumNeg = sumNeg + num;
            }             
            cont = cont + 1;
            
            System.out.println("La suma de los pares es; " +sumPar);
            System.out.println("La suma de los impares es; " +sumImpar);
            System.out.println("La suma de los positivos es; " +sumPos);
            System.out.println("La suma de los negativos es; " +sumNeg);
        }
        
        System.out.println("sumas totales \n");
        System.out.println("La suma de los pares es; " +sumPar);
        System.out.println("La suma de los impares es; " +sumImpar);
        System.out.println("La suma de los positivos es; " +sumPos);
        System.out.println("La suma de los negativos es; " +sumNeg);
    }
    
}
