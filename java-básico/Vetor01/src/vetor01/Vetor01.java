package vetor01;

public class Vetor01 {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        int n[] = {3, 2, 8, 7, 5, 4};
        /*
        System.out.println("Total de casas de N: " + n.length); */

 /*   for ( int c=0; c<=5; c++ ){ */
            for (int c = 0; c <= n.length - 1; c++) {
            System.out.println("Na posição " + c + " temos o vetor " + n[c] + "...");
            
        }
             for (int valor : n) {
                System.out.println(valor);
            }

    }

}
