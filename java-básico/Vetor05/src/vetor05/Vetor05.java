package vetor05;

import java.util.Arrays;


public class Vetor05 {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        int v[] = new int [20];
        Arrays.fill(v, 5);
        for (int valor:v){
            System.out.print(valor +" | ");
        }
    }

}
