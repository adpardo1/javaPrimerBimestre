package ciclofor;

/**
 *
 * @author GHOST
 */
public class Taller61 {
    public static void main(String[] args) {
        //Declaracion e inicializacion de variables 
        int num, multiplo;
        num = 5; multiplo =0;
        // Ciclo para 
        
        System.out.println("Ciclo Para");
        System.out.println("------------");
        for (int i=1; i <=100; i++){
            multiplo = num*i;
            System.out.println(multiplo);
        }
        //Ciclo hacer- mietras 
        
        System.out.println("Ciclo Hacer-Mientras");
        System.out.println("---------------------");
        int i=1;
        do {
            multiplo = num*i;
            System.out.println(multiplo);
            i++;            
        }   
        while(i<=100);             
        
        
    
        
            
    }
    
}
