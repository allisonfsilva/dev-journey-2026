package petshopbanho;

import java.util.Scanner;


public class PetShopBanho {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        Scanner scanner = new Scanner(System.in);
        CleanMachine maquina = new CleanMachine();
        int opcao;

        System.out.println("🐕 Bem-vindo ao Sistema Automatizado de Banho Pet!");

        do {
            System.out.println("\n===== COMANDOS =====");
            System.out.println("1 - Abastecer Água (+2L)");
            System.out.println("2 - Abastecer Shampoo (+2L)");
            System.out.println("3 - Colocar Pet na Máquina");
            System.out.println("4 - Dar Banho no Pet");
            System.out.println("5 - Retirar Pet da Máquina");
            System.out.println("6 - Limpar Máquina");
            System.out.println("0 - Desligar Sistema");
            System.out.print("Escolha uma ação: ");
            
            opcao = scanner.nextInt();
            
            // O PULO DO GATO: Limpando o "Enter" do teclado!
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> maquina.abastecerAgua();
                case 2 -> maquina.abastecerShampoo();
                case 3 -> {
                    System.out.print("Qual é o nome do pet que vai tomar banho? ");
                    String nomeDigitado = scanner.nextLine();
                    
                    // Aqui usamos a SUA classe! Instanciamos o objeto Pet:
                    Pet novoPet = new Pet(nomeDigitado);
                    
                    // E passamos o objeto inteiro para dentro da máquina:
                    maquina.colocarPet(novoPet);
                }
                case 4 -> maquina.darBanho();
                case 5 -> maquina.retirarPet();
                case 6 -> maquina.limparMaquina();
                case 0 -> System.out.println("Encerrando o expediente. Até mais!");
                default -> System.out.println("Comando inválido!");
            }
        } while (opcao != 0);

        scanner.close();
    
    }

}
