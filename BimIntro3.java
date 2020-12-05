package bimintro1;
import java.util.Scanner;
/**
 *
 * @author GHOST
 */
public class BimIntro3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Programa para mostrar la base, potencia y fracciones
        //Declaracion e inicializacion de variables 
        int num, pot, sec, lim,num1,deno=7;
        double sum=0;
        //Porceos
        System.out.println("Ingrese el limite de la serie");
        lim=leer.nextInt();
        lim = lim -1;
        for(int i=0; i<=lim; i++){
            deno= deno+3*i;
            pot = 2 + 2*i;            
            if (i%2==0){
                num=1;
            }
            else{
                num=2;
            }
            num1= (int)Math.pow(num, pot);
            
            sum = sum + (double)num1/deno;
            System.out.println(num+"^"+pot+"/"+deno);
            
            
        }
        System.out.println("La suma total es: "+sum);
    }
    
}
