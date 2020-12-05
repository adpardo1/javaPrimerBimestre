package ciclofor;
import java.util.Scanner;

/**
 *
 * @author GHOST
 */
public class CicloFor {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);        
        int n = 0;
        int primero = 0;
        int segundo = 1;
        int fibo = 0;
        int suma = 0;
        int suma1 = 0;
              
        System.out.println("Ingrese el límite de la serie Fibonacci \n");
        n = leer.nextInt();      
        
        for(int i = 1; i<=n; i++){
            
            if (i < 2){
                
                System.out.println(i +", " +primero);
                System.out.println(i+1 +", " +segundo);
                suma = primero + segundo;
                i++;
            }
            else{
                
                fibo = primero + segundo;
                suma = suma + fibo;
                primero = segundo;
                segundo = fibo;
            
                System.out.println(i +", " +fibo);       
            }
        }  
        System.out.println("\n");
        System.out.println("La suma de Fibonacci es:" +suma);

    }
    
}
