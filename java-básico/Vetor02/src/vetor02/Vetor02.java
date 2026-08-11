package vetor02;

import java.util.Scanner;

public class Vetor02 {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = teclado.nextInt();

        // Verifica a regra completa do ano bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano de " + ano + " é bissexto.");
            String mes[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN",
                "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
            int tot[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for (int c = 0; c < mes.length; c++) {
                System.out.println("O mes de " + mes[c] + " tem "
                        + tot[c] + " dias ao todo.");
            }
        } else {
            System.out.println("O ano de " + ano + " não é bissexto.");
            String mes[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN",
                "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
            int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for (int c = 0; c < mes.length; c++) {
                System.out.println("O mes de " + mes[c] + " tem "
                        + tot[c] + " dias ao todo.");
            }
        }
        teclado.close();
    }
}

    

    
