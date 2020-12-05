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
public class Primo {
    public static void main(String[] args) {
                Scanner leer = new Scanner (System.in);
        
        int cont, cont1, n, divisor, num;
        cont = 1; cont1 = 1; n = 0; divisor = 0; num = 0;
        
        System.out.println("Ingrese el límite de números");
        
        n = leer.nextInt();
        
        while (cont <= n){
            
            System.out.println("Ingrese el número a verificar");
            num = leer.nextInt();
            
            while (cont1 <= num) {                
                if (num % cont1 == 0){                    
                    divisor = divisor + 1;
                }                
                cont1 = cont1 + 1;
            }                        
            if (divisor == 2){                
                System.out.println(num + " es Primo \n");
            } 
            else {
                System.out.println(num + " no es Primo\n");
            }
            cont1 = 1;
            divisor = 0;            
            cont = cont + 1;
        }
    }
    
}
