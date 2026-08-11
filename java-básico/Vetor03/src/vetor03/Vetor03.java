package vetor03;

import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        double v[] = {3.5, 2.6, 5.5, 8.2, 4.7, 8, -5};
        
        Arrays.sort(v);
        
        for (double valor : v) {
            System.out.print(valor + " | ");
        }
    }

}
