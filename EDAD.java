/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;
import java.util.Scanner;

/**
 *
 * @author GHOST
 */
public class EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Inicializacion y declaracion de variables
        String o;
        o="";
        int f11, f12, f13, f21, f22, f23, t;
        f11=0; f12=0; f13=0; f21=0; f22=0; f23=0; t=0;
        double d, m, a, r;
        d=0; m=0; a=0; r=0;
        System.out.println("Programa para determinar su edad en dias, meseso años");
        System.out.println("Ingrese su dia de nacimiento en numeros");
        f11=leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento en numeros");
        f12=leer.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        f13=leer.nextInt();
        System.out.println("Ingrese el dia actual en numeros");
        f21=leer.nextInt();
        System.out.println("Ingrese el mes actual en numeros");
        f22= leer.nextInt();
        System.out.println("Ingrese el año actual");
        f23=leer.nextInt();
        System.out.println("En que valores quiere conocer su edad recuerde que 1= Dias, 2= Meses y 3= años");
        t=leer.nextInt();
        //Procesos
        if ((f21<=31)&&(f21>0) && (f11<=31)&&(f11>0)){
            d=f21-f11;
            if (d<0){
                d=d*-1;
            }            
        }
        if ((f22<=12)&&(f22>0) && (f12<=12)&&(f12>0)){
            m=f22-f12;
            if (m<0){
                m=m*-1;                
            }            
        }
        a=f23-f13;
        
        if ((t>=1)&&(t<2)){
            r= d+(m*30)+(a*360);
            o="dias";
        }
        if ((t>=2)&&(t<3)){
            r= m+(d/30)+(a*12);
            o="meses";
        }
        if ((t>=3)&&(t<4)){
            r= a+(m/12)+(d/360);
            o="años";
        }
        System.out.println("Su resultado es "+r+" "+o);
    }
    
}
