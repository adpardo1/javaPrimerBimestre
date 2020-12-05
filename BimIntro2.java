package bimintro1;
import java.util.Scanner;
/**
 *
 * @author GHOST
 */
public class BimIntro2 {
    public static void main(String[] args) {
        //Programa para mostrar los multiplos commprendidos entre dos numeros ingresados
        Scanner leer = new Scanner(System.in);
        //Declacracion e inicializacion de variables
        int n1, n2;
        System.out.println("Programa para mostrar los multiplos commprendidos entre dos numeros ingresados \n");
        System.out.println("Ingrese el primer valor ");
        n1=leer.nextInt();
        System.out.println("Ingrese el segundo valor ");
        n2=leer.nextInt();
        System.out.println("Los multiplos de 3 comprendidos entre "+n1+" y "+n2+", son: ");
        for(int i=n1; i<=n2;i++){
            int multiplo;
            if (i%3==0){
                multiplo=i;
                System.out.println(multiplo);
                
            }
            else{
                
            }
            
            
        }       
        
    }
    
}
