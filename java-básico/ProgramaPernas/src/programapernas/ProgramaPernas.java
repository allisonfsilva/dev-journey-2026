package programapernas;

import java.util.Scanner;


public class ProgramaPernas {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        Scanner tec = new  Scanner (System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        switch (perna) {
            case 1: 
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4: 
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aracnídeo";
                break;
            default:
                tipo = "E.T";
                break;
        }
        System.out.print(tipo);
    }

}
