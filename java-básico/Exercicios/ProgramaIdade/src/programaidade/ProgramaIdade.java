package programaidade;

import java.util.Scanner;


public class ProgramaIdade {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        Scanner t = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento: ");
        int nasc = t.nextInt();
        int id = 2026-nasc;
        if (id>=18) {
            System.out.println("Parabéns! Você é de maior");
        } else {
            System.out.println("Você é menores!1995");
        }
     }
}
