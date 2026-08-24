package controlarcarro;

import java.util.Scanner;


public class ControlarCarro {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        Scanner scanner = new Scanner(System.in);
        Carro meuCarro = new Carro();
        int opcao;
        System.out.println("==================================");
        System.out.println("🚘 Bem-vindo ao Simulador de Carro!");
        System.out.println("==================================");

        do {
            System.out.println("");
            meuCarro.verificarPainel(); 
            System.out.println("");
            System.out.println("\n===== COMANDOS =====");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar (+1 km/h)");
            System.out.println("4 - Desacelerar (-1 km/h)");
            System.out.println("5 - Trocar Marcha");
            System.out.println("6 - Virar (Esquerda/Direita)");
            System.out.println("0 - Sair do carro");
            System.out.print("Escolha uma ação: ");
            System.out.println("");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> meuCarro.ligarCarro();
                case 2 -> meuCarro.desligarCarro();
                case 3 -> meuCarro.acelerar();
                case 4 -> meuCarro.desacelerar();
                case 5 -> {
                    System.out.print("Engatar qual marcha (0 a 6)? ");
                    int marchaEscolhida = scanner.nextInt();
                    meuCarro.trocarMarcha(marchaEscolhida);
                }
                case 6 -> {
                    System.out.print("Virar para [1] Esquerda ou [2] Direita? ");
                    int direcao = scanner.nextInt();
                    if (direcao == 1) {
                        meuCarro.virar("Esquerda");
                    } else if (direcao == 2) {
                        meuCarro.virar("Direita");
                    } else {
                        System.out.println("Direção inválida!");
                    }
                }
                case 0 -> System.out.println("Saindo do carro... Até a próxima viagem!");
                default -> System.out.println("Comando não reconhecido!");
            }
        } while (opcao != 0);

        scanner.close();
    
    }

}
