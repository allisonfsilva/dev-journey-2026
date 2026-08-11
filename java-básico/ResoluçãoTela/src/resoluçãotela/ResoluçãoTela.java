
package resoluçãotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoTela {


    public static void main(String[] args) {
      
        // Chama a ferramenta que faz a ponte entre o Java e o seu sistema gráfico
        Toolkit kit = Toolkit.getDefaultToolkit();
        
        // Pega as dimensões (largura e altura) da tela principal
        Dimension tamanhoTela = kit.getScreenSize();
        
        // Mostra o resultado pegando a largura (width) e a altura (height)
        System.out.println("A resolução da tela é: " + tamanhoTela.width + " x " + tamanhoTela.height);
    }
    
}
