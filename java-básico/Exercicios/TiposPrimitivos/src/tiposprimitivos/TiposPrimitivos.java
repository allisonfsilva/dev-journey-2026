package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {


    public static void main(String[] args) {
        
        
     /*   String nome = "Allison";
        
        float n1 = 8.8f;
        
        System.out.printf("A nota é %.1f: \n ", n1);
        System.out.println("A nota é: " + n1);
        System.out.println(nome+" tirou: "+n1);
     */   
        System.out.println("-------------------------------------------------------------------------------------------");
        
        Scanner teclado = new Scanner (System.in);
          
        System.out.println("Digite seu nome: ");
        
        String nome = teclado.nextLine();
        
        System.out.println("Digite sua nota: ");
        float n1 = teclado.nextFloat();
        
         System.out.println(nome+" tirou: "+n1);
                 
      
        
        
    }
    
}
