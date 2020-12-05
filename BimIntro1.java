package bimintro1;
import java.util.Scanner;
/**
 *
 * @author GHOST
 */
public class BimIntro1 {
    public static void main(String[] args) {
        //Programa para Verificar si un número es positivo, negativo, par o impar
        Scanner leer = new Scanner(System.in);
        // Inicializacion y declaracion de variables 
        int op, n, cont=1, divisor =0;
        System.out.println("Programa para Verificar si un número es positivo, negativo, par o impar \n");
        System.out.println("Ingrese un valor");
        n=leer.nextInt();
        System.out.println("Escoja una opcion \n");
        System.out.println("1. Verificar si es par o impar");
        System.out.println("2. Verificar su es positivo o negativo");
        System.out.println("3. Verificar si es múltiplo de 3");
        System.out.println("4. Verificar si es primo");
        op=leer.nextInt();
        //Procesos 
        switch (op){
            case 1:{
                if(n%2==0){
                    System.out.println("El valor "+n+", es par");
                }
                else{
                    System.out.println("El valor "+n+", es imparpar");
                }
            }
            break;
            case 2:{
                if (n>0){
                    System.out.println("EL valo "+n+", es positivo");
                }
                else{
                    System.out.println("EL valo "+n+", es negativo");
                }
            }
            break;
            case 3:{
                if (n%3==0){
                    System.out.println("El valor "+n+", es multiplo de 3");
                }
                else{
                    System.out.println("El valor "+n+", no es multiplo de 3");
                }
            }
            break;
            case 4:{
                while (cont <= n) {
                
                if (n % cont == 0){
                    
                    divisor = divisor + 1;
                }
                
                cont = cont + 1;
            }
                        
            if (divisor == 2){
                
                System.out.println("El valor "+n + ", es primo");
            } 
            else {
                System.out.println("El valor "+n + ", no es primo");
            }                       
            }
            break;
        }
        
    }
    
}
