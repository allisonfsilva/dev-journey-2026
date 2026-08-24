package menubanco;

public class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500.0) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.50; 
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
    }

    public void consultarChequeEspecial() {
        System.out.println("Limite total do Cheque Especial: R$ " + String.format("%.2f", this.limiteChequeEspecial));
        if (this.saldo < 0) {
            double limiteDisponivel = this.limiteChequeEspecial + this.saldo;
            System.out.println("Limite DISPONÍVEL no momento: R$ " + String.format("%.2f", limiteDisponivel));
        }
    }

    public boolean usandoChequeEspecial() {
        return this.saldo < 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        if (usandoChequeEspecial()) {
            double valorUsado = Math.abs(this.saldo); 
            double taxa = valorUsado * 0.20;
            System.out.println("Você estava usando o cheque especial. Taxa de 20% (R$ " + taxa + ") cobrada.");
            
            valor = valor - taxa; 
        }

        this.saldo = this.saldo + valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (this.saldo + this.limiteChequeEspecial >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo e limite insuficientes para este saque.");
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("Iniciando pagamento de boleto...");
        sacar(valor); 
    }
}
