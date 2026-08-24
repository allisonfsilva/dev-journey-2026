package controlarcarro;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }
    
    private boolean isDesligado() {
    if (this.ligado == false) {
        System.out.println("O carro está desligado.");
        System.out.println("");
        return true; 
    }
    return false; 
}

    public void ligarCarro() {
        System.out.println("Ligando carro...");
        System.out.println("Carro ligado!");
        this.ligado = true;
    }

    public void desligarCarro() {
        if (this.marcha == 0 && this.velocidade == 0) {
            System.out.println("Desligando carro...");
            System.out.println("Carro desligado!");
            this.ligado = false;
        }
    }

    public void acelerar() {
       if (isDesligado()) return;

        if (this.marcha == 0) {
            System.out.println("O carro está em ponto morto. Engate uma marcha.");
            return;
        }

        if (this.velocidade >= 120) {
            System.out.println("Atenção: Velocidade máxima (120 km/h) atingida!");
            return;
        }

        if (this.marcha == 1 && this.velocidade >= 20) {
            System.out.println("Limite da 1ª marcha atingido. Troque de marcha!");
            return;
        } else if (this.marcha == 2 && this.velocidade >= 40) {
            System.out.println("Limite da 2ª marcha atingido. Troque de marcha!");
            return;
        } else if (this.marcha == 3 && this.velocidade >= 60) {
            System.out.println("Limite da3ª marcha atingido. Troque de marcha!");
            return;
        } else if (this.marcha == 4 && this.velocidade >= 80) {
            System.out.println("Limite da 4ª marcha atingido. Troque de marcha!");
            return;
        } else if (this.marcha == 5 && this.velocidade >= 100) {
            System.out.println("Limite da 5ª marcha atingido. Troque de marcha!");
            return;
        }

        this.velocidade += 1;
        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
    }

    public void desacelerar() {
       if (isDesligado()) return;

        if (this.velocidade <= 0) {
            System.out.println("O carro já está parado (0 km/h)!");
            return;
        }

        this.velocidade -= 1;
        System.out.println("Desacelerando... Velocidade atual: " + this.velocidade + " km/h");
    }

   public void trocarMarcha(int novaMarcha) {
        if (isDesligado()) return;

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida! O carro só tem marchas de 0 a 6.");
            return;
        }

        if (novaMarcha == this.marcha + 1 || novaMarcha == this.marcha - 1) {
            this.marcha = novaMarcha;
            System.out.println("Marcha trocada para: " + this.marcha);
        } else {
            System.out.println("Você não pode pular marchas! Marcha atual: " + this.marcha);
        }
    }

public void virar(String direcao) {
       if (isDesligado()) return;

        if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Virando o carro para a " + direcao + " com segurança.");
        } else {
            System.out.println("Erro: Velocidade perigosa para virar! Reduza para entre 1 e 40 km/h.");
        }
    }

    public void verificarPainel() {
        String estado = this.ligado ? "LIGADO" : "DESLIGADO";
        System.out.println("--- PAINEL DO CARRO ---");
        System.out.println("Motor: " + estado + " | Velocidade: " + this.velocidade + " km/h | Marcha: " + this.marcha);
        System.out.println("-----------------------");
    }

}
