package menubanco;

import java.util.Scanner;

public class MenuBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- ABERTURA DE CONTA ---");
        System.out.print("Digite o valor do depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao;

        do {
            System.out.println("\n===== MENU DO BANCO =====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar uso do Cheque Especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 ->
                    conta.consultarSaldo();
                case 2 ->
                    conta.consultarChequeEspecial();
                case 3 -> {
                    System.out.print("Valor do depósito: R$ ");
                    double valorDep = scanner.nextDouble();
                    conta.depositar(valorDep);
                }
                case 4 -> {
                    System.out.print("Valor do saque: R$ ");
                    double valorSaq = scanner.nextDouble();
                    conta.sacar(valorSaq);
                }
                case 5 -> {
                    System.out.print("Valor do boleto: R$ ");
                    double valorBol = scanner.nextDouble();
                    conta.pagarBoleto(valorBol);
                }
                case 6 -> {
                    if (conta.usandoChequeEspecial()) {
                        System.out.println("Atenção: A conta ESTÁ usando o cheque especial.");
                    } else {
                        System.out.println("Tudo certo: A conta NÃO está usando o cheque especial.");
                    }
                }
                case 0 ->
                    System.out.println("Encerrando o sistema do banco. Até logo!");
                default ->
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0); 

        scanner.close();

    }

}
