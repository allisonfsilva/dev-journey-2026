package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        int n, s = 0;
        String r;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            s += n; // s = s+n
            System.out.println("Deseja continuar? [S/N]");
            r = sc.next();

        } while (r.equals("S"));
        System.out.println("A soma é " + s);

    }

}
