package programamedia;

import java.util.Scanner;


public class ProgramaMedia {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
         System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi "+m);
        if (m>8){
            System.out.println("Parabéns!");
        }
        
        
        
    }

}
