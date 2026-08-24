package petshopbanho;

public class CleanMachine {

    private int nivelAgua;
    private int nivelShampoo;
    private boolean precisaLimpeza;
    private Pet petAtual;

    public void verificarPainel() {
        String nomeNoPainel = (this.petAtual != null) ? this.petAtual.getName() : "Vazio";

        System.out.println("\n--- PAINEL DO PETSHOP ---");
        System.out.println("Pet na máquina: " + nomeNoPainel);
        System.out.println("-------------------------");
    }

    public CleanMachine() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.precisaLimpeza = false;
        this.petAtual = null;
    }

    public void abastecerAgua() {
        if (this.nivelAgua >= 30) {
            System.out.println("Aviso: A máquina já está com a capacidade máxima de água (30L).");
            return;
        }
        this.nivelAgua += 2;
        if (this.nivelAgua > 30) {
            this.nivelAgua = 30; 
        }
        System.out.println("Água abastecida. Nível atual: " + this.nivelAgua + "L");
    }

    // MÉTODO FALTANDO 2: Abastecer Shampoo
    public void abastecerShampoo() {
        if (this.nivelShampoo >= 10) {
            System.out.println("Aviso: A máquina já está com a capacidade máxima de shampoo (10L).");
            return;
        }
        this.nivelShampoo += 2;
        if (this.nivelShampoo > 10) {
            this.nivelShampoo = 10; 
        }
        System.out.println("Shampoo abastecido. Nível atual: " + this.nivelShampoo + "L");
    }

    public void limparMaquina() {
        if (this.petAtual != null) {
            System.out.println("Erro: Retire o pet antes de iniciar a limpeza da máquina.");
            return;
        }
        if (!this.precisaLimpeza) {
            System.out.println("Aviso: A máquina já está limpa, não é necessário limpar agora.");
            return;
        }
        if (this.nivelAgua < 3 || this.nivelShampoo < 1) {
            System.out.println("Erro: Água ou shampoo insuficiente para realizar a limpeza.");
            return;
        }

        this.nivelAgua -= 3;
        this.nivelShampoo -= 1;
        this.precisaLimpeza = false;
        System.out.println("Limpeza concluída! A máquina está pronta para o próximo pet.");
    }

    public void colocarPet(Pet novoPet) {
        if (this.petAtual != null) {
            System.out.println("Erro: Já tem um pet na máquina!");
            return;
        }
        if (this.precisaLimpeza) {
            System.out.println("Erro: A máquina está suja!");
            return;
        }

        this.petAtual = novoPet;
        System.out.println(this.petAtual.getName() + " entrou na máquina.");
    }

    public void darBanho() {
        if (this.petAtual == null) {
            System.out.println("Erro: A máquina está vazia.");
            return;
        }

        if (this.petAtual.isClean()) {
            System.out.println(this.petAtual.getName() + " já tomou banho!");
            return;
        }

        if (this.nivelAgua < 10 || this.nivelShampoo < 2) {
            System.out.println("Erro: Produtos insuficientes.");
            return;
        }

        this.nivelAgua -= 10;
        this.nivelShampoo -= 2;

        this.petAtual.setClean(true);
        System.out.println(this.petAtual.getName() + " está cheiroso!");
    }

    public void retirarPet() {
        if (this.petAtual == null) {
            System.out.println("Erro: A máquina já está vazia.");
            return;
        }

        if (!this.petAtual.isClean()) {
            this.precisaLimpeza = true;
            System.out.println("Aviso: " + this.petAtual.getName() + " saiu sujo. Máquina bloqueada para limpeza!");
        } else {
            System.out.println(this.petAtual.getName() + " foi retirado limpinho.");
        }

        this.petAtual = null;
    }

}
